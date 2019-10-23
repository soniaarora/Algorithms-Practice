package SDE.Arrays;

public class test {

    public static void main(String[] arg){

        System.out.println(compare("wxy", "wxyz"));
    }


    public static boolean compare(String s1, String s2){

        int letter_index = 0;
        while(letter_index < s1.length()){
            letter_index += 1;
            char letter1 = s1.charAt(letter_index);
            char letter2 = s2.charAt(letter_index);
            if(letter1 > letter2){
                return true;
            }
            else if(letter2 > letter1){
                return false;
            }


        }

        return true;
    }

}
