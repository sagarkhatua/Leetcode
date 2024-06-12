package String;

import java.util.Scanner;

public class countLower {

    public static void main(String[] args) {
        System.out.println("Enter something: ");
        String str =new Scanner(System.in).next();
        int count =0;

        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if ( ch =='a'|| ch=='e' || ch=='i'||ch=='o'|| ch=='u'){
                count ++;
            }
        }
        System.out.println(count);

    }
}
