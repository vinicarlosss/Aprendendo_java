package one.digitalinnovation.basecamp;

public class Quadrilatero {
    public  static String  area(double lado){
        return ("Area do quadrado: "+lado*lado);
    }

    public static String area(double lado1, double lado2){
        return("Area do retângulo: "+lado1*lado2);
    }
    public static String area(double baseMaior, double baseMenor, double altura){
        return("Área do trapézio: "+((baseMaior+baseMenor)*altura)/2);
    }
}