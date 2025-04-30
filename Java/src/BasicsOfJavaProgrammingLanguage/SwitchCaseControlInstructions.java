package BasicsOfJavaProgrammingLanguage;
import java.util.Scanner ;
public class SwitchCaseControlInstructions {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check for switch case : ");
        int check = sc.nextInt();

        switch(check){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            default:
                System.out.println("The number is may be equal to Five or greater than Five !");
        }
    }
}
