import java.util.HashMap;


public class freq_count_of_char {
    public static void main(String[] args) throws Exception {

        HashMap <Character, Integer> map = new HashMap<>();
        
        String alphabet = "aabbdfggdgkkagriganergiergnadfnvcadscn";
       
        for (int i = 0; i < alphabet.length(); i++) {
            char key = alphabet.charAt(i);
           
            if (map.containsKey(key)) {
                int count = map.get(key);
                count++;
                map.put(key, count);
            } else {
                map.put(key, 1);
            }
        }
        System.out.println(map);
    }
}