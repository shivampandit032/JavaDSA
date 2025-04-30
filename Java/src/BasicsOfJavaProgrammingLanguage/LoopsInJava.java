package BasicsOfJavaProgrammingLanguage;
import java.util.Scanner ;
public class LoopsInJava {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of steps to execute loop : ");
        int number = sc.nextInt();

        // for loop
        for(int i=0;i<number;i++){
            System.out.print(i+"->");
        }
        System.out.println();

        // while loop

        int i=0;
        while(i < number){
            System.out.print(i+" -> ");

            i++;
        }
        System.out.println();


        // do-while loop
        int j=0;
        do{
            System.out.print(j+"-> ");
            j+=1;
        }while(j<number);


    }
}
