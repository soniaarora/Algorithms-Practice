/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author Hp
 */
public class IntegerToRoman {
    
    public static void main(String arg[]){
        
        System.out.print(intToRoman(1419));
        
    }
    
    public enum Type{
    M(1000),CM(900),D(500),CD(400),C(100),XC(90),L(50),XL(40),X(10),IX(9),V(5),IV(4),I(1);
    private final int value;
    Type(int value) {
        this.value = value;
    }
};
public static String intToRoman(int num) {
    StringBuilder output = new StringBuilder();
    for (Type t:Type.values()) {
        while (num>=t.value) {
            output.append(t);
            num -= t.value;
        }
    }
    return output.toString();
}
    
    
    
    
    
}
