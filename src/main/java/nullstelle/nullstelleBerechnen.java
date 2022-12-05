package nullstelle;

import java.util.Arrays;

public class nullstelleBerechnen {
    public int polynomGrad;
    private double [] nullstelle = new double[2];
    public double [] koeffizienten;
    // 3x²-5x+5;

    public static void main(String[] args) {

    }
    public nullstelleBerechnen(int polynomGrad, double[] koeffizienten) {
        this.polynomGrad = polynomGrad;
        this.koeffizienten = koeffizienten;
    }

    public  double[] pqformel() {
    if (koeffizienten[2] !=1) {
        koeffizienten[1] = koeffizienten[1]/ koeffizienten[2];
        koeffizienten[0] = koeffizienten[0]/ koeffizienten[2];
    }
    nullstelle[0] = (-koeffizienten[1]/2)+Math.sqrt(Math.pow((koeffizienten[1]/2),2)- koeffizienten[0]);
    nullstelle[1] = (-koeffizienten[1]/2)-Math.sqrt(Math.pow((koeffizienten[1]/2),2)- koeffizienten[0]);
        System.out.println(Arrays.toString(nullstelle));
    return nullstelle;
    }


}