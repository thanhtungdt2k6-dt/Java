import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Main {
    private static List<Double> numbers = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println(" \n Vui lòng chọn chức năng ");
            System.out.println("1. Nhập dữ liệu vào danh sách");
            System.out.println("2. Tính tổng giá trị trong danh sách");
            System.out.println("3. Tìm ra giá trị lớn nhất trong danh sách");
            System.out.println("4. Hiện thị các giá trị trong danh sách");
            System.out.println("5. Lưu trữ thông tin trong file");
            System.out.println("0. Thoát chương trình");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    inputData();
                    break;
                case 2:
                    calcData();
                    break;
                case 3:
                    findMax();
                    break;
                case 4:
                    displayData();
                    break;
                case 5:
                    saveToFile();
                    break;
                case 0:
                    System.out.println("Thank");
                    break;
            }
        } while (choice != 0);
    }

    private static void inputData() {
        System.out.println("nhap du lieu");
        if (scanner.hasNextDouble()) {
            double val = scanner.nextDouble();
            numbers.add(val);
        } else {
            System.out.println("vui long nhap lai");
            scanner.next();
        }
    }

    private static void calcData() {
        if (numbers.isEmpty()) {
            System.out.println(" Danh sách đang trống!");
        } else {
            double sum = 0;
            for (double n : numbers) {
                sum += n;
            }
            System.out.println(" Tổng các số đã nhập: " + sum);
        }
    }

    private static void findMax() {
        if (numbers.isEmpty()) {
            System.out.println(" Danh sách đang trống!");
        } else {
            double max = java.util.Collections.max(numbers);
            System.out.println("Số lớn nhất trong danh sách là" + max);
        }
    }

    private static void displayData() {
        if (numbers.isEmpty()) {
            System.out.println("Danh sách hiện đang trống.");
        } else {
            System.out.println("Danh sách hiện tại: " + numbers);
        }
    }
    private static void saveToFile() {
        if (numbers.isEmpty()) {
            System.out.println("=> Không có dữ liệu để lưu!");
        } else {
            try (FileWriter writer = new FileWriter("data.json")) {
                writer.write("[\n");
                for (int i = 0; i < numbers.size(); i++) {
                    writer.write("  " + numbers.get(i));
                    if (i < numbers.size() - 1) {
                        writer.write(",");
                    }
                    writer.write("\n");
                }
                writer.write("]");
                System.out.println("=> Đã lưu thành công vào file data.json!");
            } catch (IOException e) {
                System.out.println("=> Lỗi khi ghi file: " + e.getMessage());
            }
        }
    }
}


