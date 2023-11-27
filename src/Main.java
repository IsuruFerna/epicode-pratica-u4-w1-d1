// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int result1 = multiply(2, 4);
        System.out.printf("multiply: " + result1);

        String result2 = concat("Bob", 5);
        System.out.printf("concat: " + result2);

    }

    public static int multiply (int num1, int num2) {
        return num1 * num2;
    }

    public static String concat (String str, int num) {
        return str + " is " + num + " years old";
    }


}