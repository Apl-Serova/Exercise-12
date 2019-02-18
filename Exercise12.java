import java.util.Scanner;
public class Exercise12 {
    public static void main (String [] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        String str1 = s.nextLine();
        System.out.println("Введите вторую строку: ");
        String str2 = s.nextLine();
        if (str1.length() > str2.length()) {
            System.out.println("Строка '"+ str1+ "' длиннее.");
        }
        else
            if (str1.length() == str2.length()) {
                System.out.println("Строки одинаковой длины.");
            }
            else {
                System.out.println("Строка '"+ str2+ "' длиннее.");
            }

    }
}
