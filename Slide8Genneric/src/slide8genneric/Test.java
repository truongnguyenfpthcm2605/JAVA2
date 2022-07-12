
package slide8genneric;

/**
 *
 * @author Truong Nguyen
 */
public class Test {
    public static void main(String[] args) {
        GenericType<String> gen1 = new GenericType<String>();
        gen1.set("Trường");
        System.out.println(gen1.get());
        
        GenericType gen2 = new GenericType();
        gen2.set(11);
        gen2.set("hahaha");
        System.out.println(gen2.get());
        
        
    }
}
