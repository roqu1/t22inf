package polynom;

public class test {
    public static void main(String[] args) {
        // 5.22*x^3 + 0*x^2 + 3.22*x^1 + 1.22*x^0
        double [] koeffizient = {5.22,0,3.22,1.22};
        Polynom koeffizient1 = new Polynom(koeffizient);
        Polynom.polynom(koeffizient1);
    }
}
