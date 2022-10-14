public class Main {

    static int discriminant(int a, int b, int c){
        return b * b - 4 * a * c;
    }

    static String strLen(String[] array){
        String small = array[0];

        for (int i =0; i < array.length; i++){
            if (small.length() > array[i].length()){
                small = array[i];
            }
        }
        return small;
    }

    public static void main(String[] args){

        System.out.println(discriminant(5, 6, 13));

        String[] array = new String[4];
        array[0]  = "hello";
        array[1]  = "s";
        array[2]  = "heisenberg";
        array[3]  = "heldfdglo";

        System.out.println(strLen(array));

        Fraction fraction1 = new Fraction();
        fraction1.numerator = 1;
        fraction1.denominator = 5;

        Fraction fraction2 = new Fraction();
        fraction2.numerator = 2;
        fraction2.denominator = 5;

        System.out.println(fraction1.addition(fraction2));
        System.out.println(fraction1.mult(fraction2));

    }
}
