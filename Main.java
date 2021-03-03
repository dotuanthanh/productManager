import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Product sanPham1 = new Product("coca", 1, 10);
        Product sanPham2 = new Product("pepsi", 12, 15);
        Product sanPham3 = new Product("orange", 2, 20);
        ProductManager pm = new ProductManager();
        pm.listProduct.add(sanPham1);
        pm.listProduct.add(sanPham2);
        pm.listProduct.add(sanPham3);
        System.out.println("Lựa chọn tính năng");
        System.out.println("1.Thêm sản phẩm mới");
        System.out.println("2.Sửa thông tin sản sản phẩm theo id");
        System.out.println("3.Hiển thị toàn bộ danh sách sản phẩm ");
        System.out.println("4.Tìm kiếm sản phẩm theo tên");
        System.out.println("5.Sắp xếp sản phẩm theo giá tăng dần");
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập lựa chọn");

        int x = 0;
        while (x > 6 || x <= 0) {
            x = Integer.parseInt(input.nextLine());
            switch (x) {
                case 1:
                    pm.add();
                case 2:
                    pm.edit();
                case 3:
                  pm.show();
                    break;
                case 4:
                   pm.findByName();
                    break;
                case 5:
                   pm.sortToDecrease();
                    break;
                default:
                    System.out.println("Vui lòng nhập đúng tùy chọn");
            }
        }
        System.out.println(pm.listProduct);
    }
}
