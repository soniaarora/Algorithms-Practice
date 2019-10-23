package Arrays.Lists;

import java.util.ArrayList;
import java.util.List;

public class spiralMatrix {


    public static void main(String arg[]){

        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        List<Integer> result = spiralForm(matrix);

        for(int i : result){

            System.out.print(i);
        }

    }

    public static List<Integer> spiralForm(int[][] matrix){

        List<Integer> result = new ArrayList();

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;


        while(true){

            for(int i = left ; i <=right ; i++){
                result.add(matrix[top][i]);

            }
            top++;

            if(isCrossed(left,right,top , bottom)){

                break;
            }

            for(int j = top ; j <= bottom ; j++ ){

                result.add(matrix[j][right]);

            }
            right--;

            if(isCrossed(left,right,top , bottom)){

                break;
            }

            for(int i = right ; i >= left ; i--){

                result.add(matrix[bottom][i]);
            }
            bottom--;
            if(isCrossed(left,right,top , bottom)){

                break;
            }

            for(int j = bottom ; j >= top ; j--){

                result.add(matrix[j][left]);
            }
            left++;
            
            if(isCrossed(left,right,top , bottom)){

                break;
            }


        }
        return result;

    }

    public static  boolean isCrossed(int left, int right, int top, int bottom){

        if(left > right || bottom < top){
            return true;
        }
        else{
            return false;
        }
    }
}
