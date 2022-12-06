package nullstelle;
import java.util.ArrayList;
import java.util.Arrays;

public class nullstelleBerechnen {
    private static int polynomGrad;
    private static double [] nullstelle = new double[2];
    public static double [] koeffizienten;
    private static double wuerzelErgebnis;
    // 3x²-5x+5;

    public static void main(nullstelleBerechnen args) {
        if (polynomGrad == 2) {
            nullstelleBerechnen.pqformel();
        } else if (polynomGrad == 1) {
            nullstelleBerechnen.linearFunktion();

        }
    }

    public nullstelleBerechnen(int polynomGrad, double[] koeffizienten) {
        this.polynomGrad = polynomGrad;
        this.koeffizienten = koeffizienten;
    }

    public static double[] pqformel() {
        //check for no coefficients in the second index
    if (koeffizienten[2] != 1) {
        koeffizienten[1] = koeffizienten[1]/ koeffizienten[2];
        koeffizienten[0] = koeffizienten[0]/ koeffizienten[2];
    }
    // check if Math.sqrt method results is 0
    wuerzelErgebnis = Math.sqrt(Math.pow((koeffizienten[1]/2),2)- koeffizienten[0]);
    if (wuerzelErgebnis == 0) {
        // if its 0, then write just one point
        nullstelle[0] = (-koeffizienten[1]/2);
        System.out.println(nullstelle[0]);
        // check if there is a positive number from Math.sqrt method
    } else if (wuerzelErgebnis > 0) {
        // Then use the formel of pq
        nullstelle[0] = (-koeffizienten[1] / 2) + Math.sqrt(Math.pow((koeffizienten[1] / 2), 2) - koeffizienten[0]);
        nullstelle[1] = (-koeffizienten[1] / 2) - Math.sqrt(Math.pow((koeffizienten[1] / 2), 2) - koeffizienten[0]);
        System.out.println(Arrays.toString(nullstelle));
        // else results
    } else {
        // Saying the user, that is a negative number from Math.sqrt
        System.out.println("Von Würzel ist eine negative Zahl entstanden!");
    }
    return nullstelle;
    }

    public static double[] linearFunktion() {
        // 10x+5 = 0
        if (koeffizienten[1] == 0 && koeffizienten[0] == 0) {
            System.out.println("Es wird 0");
        }
        return new ArrayList<String>{koeffizienten[0] * -1 / koeffizienten[1]};
    }
}