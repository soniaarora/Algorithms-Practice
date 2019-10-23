/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;


import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author Hp
 */
public class NewClass {
       public static void main(String arg[])
    {
     
    }
    
    public Map<Integer, Double> calculateHighestFive (int scoreCount, 
                        ArrayList<ProductReviewScore> reviewScoresOfProduct)
    {
        Map<Integer, Double> result = new LinkedHashMap();
        //Map<Integer, Double> sumMap = new HashMap();
        //Map<Integer, Integer> totalMap = new HashMap();
        
        for(ProductReviewScore prs1 : reviewScoresOfProduct) {

            if(!result.containsKey(prs1.productId)) {
                Double total = 0.0;
                int count = 0;
                for(ProductReviewScore prs2 : reviewScoresOfProduct) {
                    if(prs1.productId == prs2.productId) {
                        total += prs2.value;
                        count++;
                    }
                }
                Double avg = total/count;
                result.put(prs1.productId, avg);
            }
        }
        return result;
    }
    
    class ProductReviewScore {
        int productId;
        double value;
    }
}
