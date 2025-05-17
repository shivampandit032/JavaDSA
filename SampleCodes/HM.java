package SampleCodes;

import java.util.ArrayList;
import java.util.LinkedList;

public class Hashmap {
    ArrayList<LinkedList<entity>> hm;

    int size  ;

    double lf ;

    Hashmap(){
        size = 0 ;

        lf = 0.5 ;

        hm = new ArrayList<>();

        for(int i = 0 ; i < 10 ; i++){
            hm.add(new LinkedList<>());
        }

    }

    public class entity{

        String key ;

        String value ;

        entity(String k , String v){
            this.key = k;

            this.value = v ;
        }
    }

    public int getKey(String key){
        return Math.abs(key.hashCode() % hm.size());
    }

    public void push(String key , String value ){

        int hashValue = getKey(key);

        LinkedList<entity> ll = hm.get(hashValue);

        for(entity en: ll){

            if(en.key.equals(key)){
                en.value = value ;
            }
        }

        
    }
    public static void main(String[] args){


    }
}
