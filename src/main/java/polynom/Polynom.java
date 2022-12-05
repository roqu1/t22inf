package polynom;

public class Polynom {
    private double[] koeffizient;
    private int degrees = 0;
    private String exception;
    private String symmetry;

    public Polynom(double[] koeffizient) {
        this.koeffizient = koeffizient;
    }

    private double x;


    //Polynom into String with Koeffizient
    public static String polynom(Polynom koeffizient) {
        return null;
    }

    /*private void checkKoeffizient () {
        if (koeffizient.length != 5) {
            System.out.println("Es sind nicht 5 Koeffizienten");
            break;
        }
    }

    public void  derivation() {
        double[] temp;
        double[] derivation = new double[5];

        for (int i = 0; i < derivation.length; i--) {
            if(derivation[i] == 0) {
                derivation[i] = 0;
            }
            else {
                derivation[i] = koeffizient[i] *i;
            }

        }

    }

    //reverse koeffizient
    /*
    private String reverse() {
        for (int i = koeffizient.length - 1; i >= 0; i--) {
           reversekoeffizient = koeffizient[i];
        }
        //Find out what is X

        //Find out how many 'Grades of Polynom' there is
        //public double getDegrees () {
            return degrees;
        }
        //Find out if there is exponents with couple or not


    } */
}
