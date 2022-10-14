public class Fraction {

    int numerator;
    int denominator;

    String addition(Object obj){
        return numerator * ((Fraction) obj).denominator + ((Fraction) obj).numerator * denominator +  " / " + denominator * ((Fraction) obj).denominator;
    }

    String mult(Object obj){
        return numerator * ((Fraction) obj).numerator + " / " + denominator * ((Fraction) obj).denominator;
    }

    @Override
    public boolean equals(Object obj){

        if(obj instanceof Fraction) {
            if (numerator * ((Fraction) obj).denominator == denominator * ((Fraction) obj).numerator){
                return true;
            }
        }

        return false;
    }
}
