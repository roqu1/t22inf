package nullstelle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class nullstelleBerechnen {
//    private static int polynomGrad;
    private static double [] nullstelle = new double[2];
    public static double [] koeffizienten;
//    private static double wuerzelErgebnis;
    private static ArrayList<Double> roots = new ArrayList<>();
    // 3x²-5x+5;

    public static void main(nullstelleBerechnen args) {
            nullstelleBerechnen.findRoots();
    }

    public nullstelleBerechnen(double[] koeffizienten) {
        this.koeffizienten = koeffizienten;
    }

    public static ArrayList<Double> findRoots() {
        double a = koeffizienten[2];
        double b = koeffizienten[1];
        double c = koeffizienten[0];


        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            // Es gibt zwei Lösungen
            roots.add((-b + Math.sqrt(discriminant)) / (2 * a));
            roots.add((-b - Math.sqrt(discriminant)) / (2 * a));
        } else if (discriminant == 0) {
            // Es gibt eine Lösung
            roots.add(-b / (2 * a));
        } else {
            // Es gibt keine Lösung
        }

        return roots;
    }

    public String toString() {
        if (roots.isEmpty()) {
            return "Das Polynom hat keine reellen Lösungen.";
        } else {
            return "Die Nullstellen des Polynoms sind: " + roots.toString();
        }
    }
//    public static double[] pqformel() {
//        //check for no coefficients in the second index
//    if (koeffizienten[2] != 1) {
//        koeffizienten[1] = koeffizienten[1]/ koeffizienten[2];
//        koeffizienten[0] = koeffizienten[0]/ koeffizienten[2];
//    }
//    // check if Math.sqrt method results is 0
//    wuerzelErgebnis = Math.sqrt(Math.pow((koeffizienten[1]/2),2)- koeffizienten[0]);
//    if (wuerzelErgebnis == 0) {
//        // if its 0, then write just one point
//        nullstelle[0] = (-koeffizienten[1]/2);
//        System.out.println(nullstelle[0]);
//        // check if there is a positive number from Math.sqrt method
//    } else if (wuerzelErgebnis > 0) {
//        // Then use the formel of pq
//        nullstelle[0] = (-koeffizienten[1] / 2) + Math.sqrt(Math.pow((koeffizienten[1] / 2), 2) - koeffizienten[0]);
//        nullstelle[1] = (-koeffizienten[1] / 2) - Math.sqrt(Math.pow((koeffizienten[1] / 2), 2) - koeffizienten[0]);
//
//        // else results
//    }
//    return nullstelle;
//    }

//    public static ArrayList<Double> linearFunktion() {
//        return new ArrayList<>(List.of((koeffizienten[0] * -1) / koeffizienten[1]));
//    }

//    public String toString() {
//        int derivationCounter = 0;
//        StringBuilder builder = new StringBuilder("f" + ("'".repeat(derivationCounter)) + "(x) = ");
//        double[] temp = koeffizienten;
//        int firstValueIndex = -1;
//        for (int i = koeffizienten.length - 1; i >= 0; i--)
//            if (koeffizienten[i] != 0) firstValueIndex = i;
//        for (int i = temp.length - 1; i >= 0; i--) {
//            if (temp[i] != 0) {
//                builder.append(temp[i]);
//                if (i != 0) {
//                    builder.append("x");
//                    if (i != 1) builder.append("^").append(i);
//                    if (i > firstValueIndex) {
//                        if (i - 1 != 0 && temp[i - 1] < 0) {
//                            builder.append(" - ");
//                            temp[i - 1] *= -1;
//                        } else {
//                            builder.append(" + ");
//                        }
//                    }
//                }
//            }
//        }
//        System.out.println(builder);
//        return builder.toString();
//    }
}