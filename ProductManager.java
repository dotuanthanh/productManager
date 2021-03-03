import java.util.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    List<Product> listProduct;

    public ProductManager() {
        listProduct = new ArrayList<>();
    }

    public void add() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap id muon them");
        int id = Integer.parseInt(String.valueOf(input.nextInt()));
        input.nextLine();
        System.out.println("Nhap ten muon them");
        String name = input.nextLine();
        System.out.println("Nhap price muon them");
        int price = input.nextInt();
        Product product = new Product(name, id, price);
        listProduct.add(product);
    }

    public void edit() {
        System.out.println("nhap id  ");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        for (Product product : listProduct) {
            if (product.getId() == id) {
                System.out.println("Nhap  ten sua");
                String name = (scanner.nextLine());
                product.setName(name);
                scanner.nextLine();
                System.out.println("sua gia");
                int price = Integer.parseInt(String.valueOf(scanner.nextInt()));
                product.setPrice(price);
            } else System.out.println("nhap sai id");
        }
    }

    public void show() {
        for (Product product : listProduct) {
            listProduct.get(0);
            System.out.println(product.toString());
        }
    }
    public void findByName() {
        System.out.println("Nhap ten san pham can tim");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for (Product product : listProduct) {
            if (product.getName() == name) {
                System.out.println("SAN PHAM CAN TIM  " + product.toString());
            } else System.out.println("Khong tim thay");
        }
    }

    public void sortToDecrease() {
        for (int i = 0; i < listProduct.size(); i++) {
            for (int j = listProduct.size() - 1; j > i; j--) {
                if (listProduct.get(i).getPrice() < listProduct.get(i).getPrice()) {
                    Product temp = null;
                    Product a = listProduct.get(i);
                    Product b = listProduct.get(j);
                    a = temp;
                    b = a;
                    b = temp;
                }
            }
        }
    }

}


