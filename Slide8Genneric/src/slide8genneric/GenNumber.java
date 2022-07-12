/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slide8genneric;

/**
 *
 * @author Truong Nguyen
 */
public class GenNumber<T extends Number> {

    private T number;

    public GenNumber(T number) {
        this.number = number;
    }

    public T getNumber() {
        return number;
    }

    public void setNumber(T number) {
        this.number = number;
    }

    public double reciprocal() { // lay nghich dao
        return 1 / number.doubleValue();
    }

    public double fraction() { // lay thap phan
        return number.doubleValue() - number.intValue();
    }

    public boolean testequals(GenNumber<T> e) {
        if (number.doubleValue() == e.getNumber().doubleValue()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        GenNumber<Double> gen = new GenNumber<>(5.67);
        System.out.println("Nghịch đảo : " + gen.reciprocal());
        System.out.println("Phần lẻ  : " + gen.fraction());

        GenNumber<Integer> gen1 = new GenNumber<>(5);
        GenNumber<Double> gen2 = new GenNumber<>(5.5);
        System.out.println("gen1 == gen2 ?  : " + gen1.equals(gen2));

    }

}
