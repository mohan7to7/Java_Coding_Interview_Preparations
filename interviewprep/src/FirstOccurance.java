public class FirstOccurance {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
    public static void main(String[] args) {
        FirstOccurance f = new FirstOccurance();
       System.out.println("Answer : "+ f.strStr("sadbutsad","needle"));
        System.out.println("Answer : "+ f.strStr("sadbutsad","sad"));
    }
}
