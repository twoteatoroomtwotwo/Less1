import java.util.Scanner;

public class Les1c2 {public static void main (String[] args) {
    System.out.println ("Enter number 202");
    Scanner scanner = new Scanner(System.in);
    if (scanner.hasNextInt()) {
        int i = scanner.nextInt();
        switch (i)
        {case (202) -> System.out.println("you type 202");
            default -> System.out.println("you typed number not equal to 202");}}
}
}
