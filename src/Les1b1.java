import java.util.Scanner;
public class Les1b1
{public static void main(String[] args)
{System.out.println("Choose number 5, 4 or 1 ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if(x==5)
        {System.out.println("you choose 5");}
        else if (x==4)
        {System.out.println("you choose 4 ");}
        else if (x==1)
        {System.out.println("you choose 1" );}
        else{System.out.println("You choose wrong number");}
    }
}
