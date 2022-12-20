package polynom;

import java.util.ArrayList;

public class Polynom {
    private double[] koeffizient = new double[5];
    private int degree = 0;

    public Polynom(double[] koeffizient) {
        this.koeffizient = koeffizient;
    }
    
    public int getDegree() {
        for (int i = this.koeffizient.length-1; i >= koeffizient.length ; i--) {
            if (this.koeffizient[i] != 0) {
                return i;
            }
        }
        return 0;
    }




    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < koeffizient.length; i++) {
            if(koeffizient[i] !=0) {
                stringBuilder.append();
            }
        }
        return stringBuilder.toString();
    }
}
