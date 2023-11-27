import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("insert text1:");
        String text1 = input.nextLine();
        System.out.println("insert text2:");
        String text2 = input.nextLine();
        System.out.println("insert text3:");
        String text3 = input.nextLine();
        // String text2 = input.nextLine();
        // String text3 = input.nextLine();

        System.out.printf("text: " + text1 + " " + text2 + " " + text3);
        System.out.printf("text: " + text3 + " " + text2 + " " + text1);
    }
}
