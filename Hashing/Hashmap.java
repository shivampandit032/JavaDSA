package Hashing;
import java.util.*;

public class Hashmap {
    ArrayList<LinkedList<entity>> ht ;
    double lf = 0.5 ;
    int size = 0 ;

    Hashmap(){
        ht = new ArrayList<>();
        for(int i = 0 ; i< 10 ; i++){
            ht.add(new LinkedList<>());
        }
    }

    public int hashFunction(String key){
        return Math.abs(key.hashCode() % ht.size());
    }

    public void put(String key , String value){

        int hash = hashFunction(key);

        LinkedList<entity> ll = ht.get(hash);

        for(entity entity : ll){

            if(entity.key.equals(key)){
                entity.value = value ;
                return ;
            }
        }
        // if linkedlist size for any slot / bucket in hash table get 50% occupied , then double the size of the linked List .
        // This is the checking condition .
        if((double)(size) / (double)ht.size() > lf){
            reHash();
        }

        // if after iterating linkedlist we can't get any previous value at our hash , then we will create a new entity with key and value .
        ll.add(new entity(key , value));

        size++;
    }

    // Function to double the size of the Linked list
    public void reHash(){

        ArrayList<LinkedList<entity>> old = ht ;

        ht = new ArrayList<>();

        size = 0 ;

        for(int i = 0 ; i < old.size()*2 ; i++){

            ht.add(new LinkedList<>());
        }

        for(LinkedList<entity> entries : old){

            for(entity entity : entries){

                put(entity.key , entity.value);
            }
        }
    }
    public class entity{

        String key ;

        String value ;

        entity(String k , String v){

            key = k ;
            value = v;
        }
    }

    // Function to access value at particular hash value .
    public String get(String key){

        int hash = hashFunction(key);

        LinkedList<entity> ll = ht.get(hash);

        for(LinkedList<entity> entries : ht){

            for(entity entity : entries){

                if(entity.key.equals(key)){
                    return entity.value ;
                }
            }
        }
        return "";
    }
    public void remove(String key){

        int hash = hashFunction(key);

        LinkedList<entity> ll = ht.get(hash);

        String target = "";

        for(entity en : ll){

            if(en.key.equals(key)) {
                target = en.value;
                break ;
            }
        }
        ll.remove(target);
        size--;
    }

    public static void main(String[] args) {
        Hashmap hm = new Hashmap();

        hm.put("1","shivam");
        hm.put("2" , "pandit");

        System.out.println(hm.get("2"));

        System.out.println();

        System.out.println(hm);
    }
}

