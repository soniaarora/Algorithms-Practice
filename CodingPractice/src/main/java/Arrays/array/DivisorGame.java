package Arrays.array;

public class DivisorGame {

    public static void main(String arg[]) {
        System.out.println(divisorGame(4));
    }

    public static boolean divisorGame(int N) {

        int flag = 0;

        while(N > 1){

            int i = 1;
            int temp = 1;
            while( i <= N/2) {

                if(N % i == 0 && (N - i) %2 !=0)
                {
                    temp=i;
                    break;
                }
                i++;
            }

            N = N - temp;
            flag++;
        }
        return flag % 2 != 0 ? true:false;
    }
}
