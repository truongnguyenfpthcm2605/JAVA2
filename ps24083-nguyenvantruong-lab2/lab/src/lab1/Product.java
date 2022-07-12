
package lab1;


public class Product implements Dao{
    private String name;
    private double price;

    public Product() {
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public double getImportTax(){
        return this.price*0.1;
    }
    
    public void output(){
        System.out.printf("%-20s|%-15.2f|%-15.2f\n",this.name,this.price,getImportTax());
    }

    @Override
    public void insert() {
        System.out.println("Thêm mới thành công");
    }

    @Override
    public void update() {
          System.out.println("Cập nhập thành công");
    }

    @Override
    public void delete() {
        System.out.println("Xòa thành công");
    }

    @Override
    public void select() {
        System.out.println("Chọn thành công");
    }
}
