package String;

public class Palindrome_String {
    public static void main(String[] args) {
      String s1="abccba";
      System.out.println(isPalindrome(s1));  
    }
    static boolean isPalindrome(String s) {
        if(s==null || s.length()==0) {
            return true;
        }
        s=s.toLowerCase();
        for(int i=0;i<=s.length()/2;i++){
            char st=s.charAt(i);
            char en=s.charAt(s.length()-1-i);
            if(st!=en){
                return false;
        }
    }
    return true;
}
}
