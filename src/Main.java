import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    private static List<Double> numbers = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    public static void main (String[] args){
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
            switch (choice){
                case 1:
                    inputData();
                    break;
                case 2:
                    System.out.println("Update");
                    break;
                case 3:
                    System.out.println("Update");
                    break;
                case 4:
                    displayData();
                    break;
                case 5:
                    System.out.println("Update");
                    break;
                case 0:
                    System.out.println("Thank");
                    break;
            }
        } while (choice !=0);
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

    private static void displayData(){
        if (numbers.isEmpty()) {
            System.out.println("Danh sách hiện đang trống.");
        } else {
            System.out.println("Danh sách hiện tại: " + numbers);
        }
        
    }
}