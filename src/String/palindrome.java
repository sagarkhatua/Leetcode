package String;

public class palindrome {

    public static boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true ;
        }
        String cleanStr=s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        for(int i=0;i<cleanStr.length()/2;i++){
            int n= cleanStr.length();
            if(cleanStr.charAt(i)!=cleanStr.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));
    }


}
