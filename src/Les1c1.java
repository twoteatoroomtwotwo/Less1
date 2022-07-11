import java.util.Scanner;
public class Les1c1 {public static void main (String[] args) {
    System.out.println ("Enter number 7,3 or 2 ");
    Scanner scanner = new Scanner(System.in);
    if (scanner.hasNextInt()) {
        int i = scanner.nextInt();
        switch (i) {
            case (7) -> System.out.println("you type 7");
            case (3) -> System.out.println("you type 3");
            case (2) -> System.out.println("you type 2");
            default -> System.out.println("you typed another number!");}}
    else {System.out.println("Вы ввели не число!");}
}
}
