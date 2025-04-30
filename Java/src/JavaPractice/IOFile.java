package JavaPractice;
import java.util.Scanner ;
public class IOFile {
    public static void main(String[] args){
        int number ;
        // byte , short , int , long
        // float , double
        // char
        // string

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        number = sc.nextInt();

        System.out.println("The number that you entered is : "+ number);

        String[] str = new String[5];

        System.out.println(str[1]);
    }
}
