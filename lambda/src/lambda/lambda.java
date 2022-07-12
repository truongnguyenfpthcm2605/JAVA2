/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lambda;

/**
 *
 * @author Truong Nguyen
 */
@FunctionalInterface
interface Hello {
    public String sayHello();
    
}
@FunctionalInterface
interface Hel {
    public String sayHello(String name);
}
@FunctionalInterface
interface He {
    public String sayHello(String name, String com);
}

public class lambda {
    public static void main(String[] args) {
        // vi du 1
        Hello s = () -> {
            return "Hello Lambda.";
        };
        System.out.println(s.sayHello());
        
        // vidu 2
          Hel si = name -> "Hello, " + name;
          System.out.println(si.sayHello("Truong"));
          
          // vi du3
           He sa = (name, com) -> "Hello, " + name + ". Welcome to " + com;
        System.out.println(sa.sayHello("newbie", "Lambda"));
    }
}
   
    
    

