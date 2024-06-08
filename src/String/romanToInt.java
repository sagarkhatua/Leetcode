package String;

public class romanToInt {

    public static int romanToInt(String s) {
        int res = 0;
        int num =0;

        for(int i = s.length()-1;i>=0;i--){

            num = switch (s.charAt(i)) {
                case 'I' -> 1;
                case 'V' -> 5;
                case 'X' -> 10;
                case 'L' -> 50;
                case 'C' -> 100;
                case 'D' -> 500;
                case 'M' -> 1000;
                default -> num;
            };

            if(num*3 < res){
                res -=num;
            }
            else{
                res +=num;
            }

        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("IV"));
    }


}
