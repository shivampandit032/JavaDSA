package BasicsOfJavaProgrammingLanguage;
// String in Java is a Class instead of being a Datatype .
// String is Immutable in Java .
public class StringsInJava {
    public static void main(String[] args) {

        String st = "shivam Pandit";

        System.out.println(st.toUpperCase());

        System.out.println(st.toLowerCase());

        System.out.println(st.endsWith("it") ? "yes" : "No");

        st.replace("pa" ,"new");
        System.out.println(st);
    }
}
