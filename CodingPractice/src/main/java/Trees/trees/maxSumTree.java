package Trees.trees;

import sun.reflect.generics.tree.Tree;

import javax.sound.midi.Soundbank;

public class maxSumTree {

     static int maxSum = Integer.MIN_VALUE;
    public static void main(String arg[]) {

        Trees bs = new Trees(-10);

        bs.left = new Trees(9);
        bs.right = new Trees(20);
        bs.right.left = new Trees( 15);
        bs.right.right = new Trees( 7);

        System.out.println(total(bs));


    }

    static int total(Trees root){

        return totalSum(root);
    }

    static int totalSum(Trees root){

        if(root == null){
            return 0;
        }

        int left = totalSum(root.left);
        int right = totalSum(root.right);

        maxSum = Math.max(maxSum, root.data + left + right);
        System.out.println(maxSum);

        int current = root.data + Math.max(left, right);


        return current > 0 ? current : 0;


    }


}
