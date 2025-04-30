package DSA.Recursion;
import java.util.ArrayList;
public class Permutations {
    public static void main(String[] args) {
        String up = "abc";
        String p = "";
        ArrayList<String> result = new ArrayList<>();
        permute(up , p , result);

        System.out.println(result);
    }
    public static void  permute(String up , String p , ArrayList<String> result){
        if(up.isEmpty()){
            result.add(p);
            return ;
        }
        for(int i=0; i<up.length() ; i++){

            char ch = up.charAt(i);

            p = p + ch ;

            permute(up.substring(i+1) , p , result);


        }
        return ;
    }
}
