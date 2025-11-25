public class KeywordsDetector {
    public static boolean contains(String str1, String str2) {
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
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        for (int i = 0; i < sentences.length; i++) {
            String sentence = sentences[i];
            String lowerSentence = sentence.toLowerCase(); 

            for (int j = 0; j < keywords.length; j++) {
                String keyword = keywords[j];
                String lowerKeyword = keyword.toLowerCase();

                if (contains(lowerSentence, lowerKeyword)) {
                    System.out.println(sentence); 
                    break;
                }
            }
        }
    }
}
