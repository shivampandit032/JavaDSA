package JavaPractice;
import java.util.Scanner ;
public class LoopsINJava {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times you want to execute the loop : ");
        int number = sc.nextInt();

        // for loop in java

        for(int i=0;i<number ;i++){
            System.out.print(i+" ");
        }

        System.out.println();

        // while loop in Java

        int num = 0 ;

        while (num < number ){
            System.out.print(num + " ");
            num+=1 ;
        }
        System.out.println();

        // do-while loop in java

        int num2 = 0 ;
        do{
            System.out.print(num2 + " ");

            num2+=1;
        }while(num2 < number );


    }
}
