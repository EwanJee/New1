package intputOutput;
public class pp {

    public static void main(String[] args) {
        System.out.println(subseq("aabbbbaacc"));
        System.out.println(subseq("aabbbbaaacccccc"));
    }
    public static boolean Palindrome(String s){
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    public static boolean R_Palindrome(String s){
        if(s.length()<=1 || s==null){
            return true;
        }
        if(s.charAt(0) != s.charAt(s.length()-1)){
            return false;
        }
        return R_Palindrome(s.substring(1,s.length()-2));
    }
    public static char subseq(String s) {
        int count = 0;
        int temp = 0;
        char c=s.charAt(0);
        char answer=s.charAt(0);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
                if (count > temp) {
                    answer = s.charAt(i);
                    temp = count;
                }
            } else {
                c=s.charAt(i);
                count = 0;
            }
        }
        return answer;
    }
}