import java.util.HashSet;
import java.util.Set;

public class set {
    public static void main(String[] args) {
        Set<String> setTest = new HashSet<>();
        setTest.add("aa");
        setTest.add("aa");
        setTest.add("bb");

        for(String s: setTest){
            System.out.println(s);
        }
    }
        
    
}
