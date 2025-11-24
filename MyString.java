public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        char[] c = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);    
            if (ch >= 'A' && ch <= 'Z') {
                c[i] = (char) (ch + 32);
             } else {
            c[i] = ch;
            }
        }
        String s = new String(c);
        return s;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        str1 = lowerCase(str1);
        str2 = lowerCase(str2);
        int[] s1 = new int[str1.length()];
        int[] s2 = new int[str2.length()];
        for (int i = 0 ; i < str1.length(); i ++){
            s1[i] = (int) str1.charAt(i);
        }
        for (int i = 0 ; i < str2.length(); i ++){
            s2[i] = (int) str2.charAt(i);
        }
        if (str2.length() > str1.length()){
            return false;
        }
        for (int i = 0 ; i <= str1.length() - str2.length() ; i++){
            boolean same = true;
            for (int j = 0 ; j < str2.length() ; j++){
                if (s1[i+j] != s2[j]){
                    same = false;
                    break;
                }
            }
            if (same){
                return true;
            }
        }

        return false;
    }
}
