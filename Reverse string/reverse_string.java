public class reverse_string {
    public static void main(String[] args) throws Exception {
        String name = "Hallahadi";

        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(name.charAt(i) + "");
        }
    }
}