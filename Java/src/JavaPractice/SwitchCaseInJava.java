package JavaPractice;
import java.util.Scanner ;
public class SwitchCaseInJava {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number for check : ");

        int number = sc.nextInt();

        switch(number){

            case 1:

                System.out.println("One");

                break ;
            case 2:

                System.out.println("Two");

                break ;

            default:

                System.out.println("Other Values !");
        }

        System.out.print("Enter the character you want to check : ");

        char ch = sc.next().charAt(0);

        switch(ch){

            case 'a':

                System.out.println("One");

                break ;

            case 'b':

                System.out.println("Two");

                break ;

            default :

                System.out.println("Others");

        }
    }
}
