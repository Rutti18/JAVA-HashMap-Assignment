import java.util.HashMap;

public class Nicknames {
    public static void main(String[] args) throws Exception {

        // Exercise-1. Nicknames

        HashMap <String, String> name = new HashMap<>();
        name.put("mathew", "mat");
        name.put("michael", "mix");
        name.put("arthur", "artie");

        System.out.println(name.get("mathew"));
    
    }
}
