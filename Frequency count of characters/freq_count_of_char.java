import java.util.HashMap;


public class freq_count_of_char {
    public static void main(String[] args) throws Exception {


        HashMap<Character, Integer> map = new HashMap<>();

        int value = 0;
        char key;

        String alphabet = "aabbdfggdgkkagriganergiergnadfnvcadscn";

        for (int i = 0; i < alphabet.length(); i += 2) {
            map.getOrDefault(alphabet.charAt(i), value += 1);

        }
        System.out.println(key);
      
    }
}