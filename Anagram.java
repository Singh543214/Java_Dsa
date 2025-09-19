public class Anagram {
    static boolean check(String a,String b){
        if(a.length()!=b.length()) return false;
        int[] count=new int[26];
        for(char c:a.toCharArray()) count[c-'a']++;
        for(char c:b.toCharArray()) count[c-'a']--;
        for(int num:count){
            if(num!=0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String a="listen";
        String b="silent";
        System.out.println(check(a, b));
    }
}
