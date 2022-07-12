
package BAI1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Truong Nguyen
 */
public class TEST implements DAO {

    Product pr;

    ArrayList<Product> list = new ArrayList<>();

    public static void main(String[] args) {
        TEST t = new TEST();
        t.menu();
    }

    public void menu() {

        String exit = "n";
        int choose;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("_________LAB1_______");
                System.out.println("\t1.Input your Products ");
                System.out.println("\t2.Output your Product");
                System.out.println("\t3.check status interface ");
                System.out.println("\t0.Exit program!");

                System.out.print("Enter your choice here : ");
                choose = sc.nextInt();

                switch (choose) {
                    case 0:
                        System.out.println("Exit program successfull!");
                        System.exit(0);
                    case 1:
                        inputsData();
                        break;
                    case 2:
                        outputsData();
                        break;
                    case 3:
                        insert();
                        update();
                        delete();
                        select();
                        break;
                    default:
                        System.out.println("Syntax error , please choice again!");

                }
            } catch (Exception e) {
                System.out.println("Syntax error , please choice again!");
                System.out.print("chosse y/n : ");
                Scanner sc = new Scanner(System.in);
                exit = sc.nextLine();
                if (exit.equalsIgnoreCase("no")) {
                    break;
                }

            }

        } while (true);
    }

    public void inputsData() {
        do {
            Scanner sc = new Scanner(System.in);
            try {
                System.out.print("import products with or without tax (y/n) :  ");
                String tax = sc.nextLine();
                if (tax.equalsIgnoreCase("y")) {
                    System.out.print("Input name product :");
                    String name = sc.nextLine();
                    System.out.print("Input price product:  ");
                    double price = Double.parseDouble(sc.nextLine());
                    // bo trôi chữ
                    pr = new Product(name, price);
                    list.add(pr);
                } else if (tax.equalsIgnoreCase("n")) {
                    System.out.print("Import products with tax:");
                    String nametax = sc.nextLine();
                    System.out.print("Input price product with tax :  ");

                    double pricetax = Double.parseDouble(sc.nextLine());
                    pr = new NoTaxProduct(nametax, pricetax);
                    list.add(pr);
                }

            } catch (Exception e) {
                System.out.println("error");
                break;
            }
            sc = new Scanner(System.in);
            System.out.print("chosse y/n  exit or continue: ");
            String exit = sc.nextLine();
            if (exit.equalsIgnoreCase("n")) {
                System.out.println("Exit program successfull!");
                break;
            }
        } while (true);
    }

    public void outputsData() {
        System.out.printf("%-20s %-20s %s\n", "NameProduct", "PriceProDuct", "Import Tax");
        for (Product item : list) {
            item.outputs();
        }
    }

    @Override
    public void insert() {
        System.out.println("insert successful!");
    }

    @Override
    public void update() {
        System.out.println("update successful!");
    }

    @Override
    public void delete() {
        System.out.println("delete successfull!");
    }

    @Override
    public void select() {
        System.out.println("select successful!");
      
    }

}
