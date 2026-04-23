public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        String[] strs=s.split(" ");
        String lastWord=strs[strs.length-1];
        return lastWord.length();
    }
    static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }
}
