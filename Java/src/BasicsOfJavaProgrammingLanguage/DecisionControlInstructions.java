package BasicsOfJavaProgrammingLanguage;
import java.util.Scanner ;
public class DecisionControlInstructions {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if(number < 0 ){
            System.out.println("User has given Negative number as Input");
        }
        else if(number >= 0 && number <= 100){
            System.out.println("User has given positive number but less than or equal to 100 ");
        }
        else{
            System.out.println("User has given positive number greater than 100 ");
        }
    }
}
