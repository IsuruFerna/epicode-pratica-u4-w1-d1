import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int result1 = multiply(2, 4);
        System.out.println("multiply: " + result1);

        String result2 = concat("Bob", 5);
        System.out.println("concat: " + result2);

        String[] arr = {"1", "2", "3", "4", "5"};
        String[] result = newArr(arr, "string");

        System.out.println("arr result: " + Arrays.toString(result));
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static String concat(String str, int num) {
        return str + " is " + num + " years old";
    }

    public static String[] newArr(String[] arr, String str) {
        if (arr.length == 5) {
            String[] output = new String[6];
            for (int i = 0; i < arr.length; i++) {
                if (i == 2) {
                    output[2] = str;
                }
                if (i >= 2) {
                    output[i + 1] = arr[i];
                } else {
                    output[i] = arr[i];
                }
            }
            return output;
        } else {
            throw new Error("inserted array's length must be 5");
        }
    }
}