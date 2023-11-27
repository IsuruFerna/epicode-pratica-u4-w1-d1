import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        double para = parameter(2.5, 3);
        System.out.println("parameter is " + para);

        byte pariDispari = oddOrEven(1);
        byte pariDispari1 = oddOrEven(6);

        System.out.println("dispari " + pariDispari);
        System.out.println("pari " + pariDispari1);

        double triangle = areaOfTriangle(18, 30, 24);
        System.out.println("area of triangle: " + triangle);
    }

    public static double parameter(double width, double length) {
        return 2 * (width + length);
    }

    public static byte oddOrEven(int num) {
        byte result = 1;
        if(0 <= num) {
            if(num % 2 == 0) {
                result = 0;
            }
        }
        return result;
    }

    public static double areaOfTriangle(double side1, double side2, double side3) {
        double p = (side1 + side2 + side3) / 2;
        return Math.sqrt(p *((p - side1) * (p - side2) * (p - side3)));
    }
}
