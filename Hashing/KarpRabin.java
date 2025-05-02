package Hashing;

// This is a "String Matching Algorithm " . Time complexity of the algorithm is : O(N) .
public class KarpRabin {
    double Prime = 101 ;
    public double getHash(String s){

        double hash = 0 ;

        for(int i = 0 ; i< s.length() ;i++){
            hash = hash + s.charAt(i) * (Math.pow(Prime , i));
        }

        return hash ;
    }

    public double updateHash(double prevHash , char oldChar , char newChar , int length ){

        double newHash = (prevHash - oldChar) / Prime ;
        newHash = newHash + newChar * Math.pow(Prime , length - 1);

        return newHash ;
    }

    public void search(String text , String substring){

        int substringLength = substring.length() ;

        double substringHash = getHash(substring);

        double textHash = getHash(text.substring(0 , substringLength));

        for(int i=0; i<= text.length() - substringLength ; i++){

            if(substringHash == textHash){

                if(text.substring(i, i+substringLength).equals(substring)){
                    System.out.println("we found the substring at index : "+i);
                }
            }
            if(i < text.length() - substringLength){

                textHash = updateHash(textHash , text.charAt(i) , text.charAt(i + substringLength) , substringLength);
            }
        }
    }
    public static void main(String[] args) {

        KarpRabin algo = new KarpRabin();

        algo.search("My name is Shivam","Shivam");
    }
}
