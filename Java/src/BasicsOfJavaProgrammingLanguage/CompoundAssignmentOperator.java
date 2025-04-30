package BasicsOfJavaProgrammingLanguage;

import java.util.Scanner ;
public class CompoundAssignmentOperator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();

        System.out.println( (number < 0) ? ("User has given a negative number "):("User has given a positive number "));
    }
}
