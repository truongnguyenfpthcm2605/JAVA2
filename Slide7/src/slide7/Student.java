package slide7;

import static java.lang.System.*;
// tao chú thích
@interface Hibernate_table {

    String value();

}

@interface Hibernate_field {

    String value();

}

@interface Hibernate_method {

    String value();

}
// ket thuc

@Hibernate_table("đây là lớp sinh viên")
public class Student {

    @Hibernate_field("đây là thuộc tính id cua sinh viên")
    String id;
    @Hibernate_field("đây là tên cua sinh viên")
    String name;

    @Hibernate_method("đây là hàm nhập dữ liệu")
    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }
    @Hibernate_method("Xuất thông tin sinh viên")
    public void output(){
        out.println(id);
        out.println(name);
        
    }
    @Hibernate_method("Hàm chạy")
    public static void main(String[] args) {
        Student sv = new Student("ps24083", "Truong");
        sv.output();
    }

}
