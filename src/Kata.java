public class Kata {
    public static String encryptThis(String text) {
        String[] texto = text.split(" ");
        String encrypted = "";
        for (String word : texto) {
            if (word.isEmpty()) {
                continue;
            }
            int ascii = (int) word.charAt(0);
            encrypted += ascii;
            if (word.length() > 1) {
                char segunda = word.charAt(1);
                char ultima = word.charAt(word.length() - 1);
                encrypted += ultima + word.substring(2, word.length() - 1) + segunda;
            }
            encrypted += " ";
        }
        return encrypted.trim();
    }
    public static void main(String[] args) {
        System.out.println(encryptThis("Hello"));
        System.out.println(encryptThis("good"));
        System.out.println(encryptThis("hello world"));
    }
}