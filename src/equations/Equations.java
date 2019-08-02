/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equations;
import java.util.*;
/**
 *
 * @author Kamson
 */
public class Equations {

    /**
     * author Kamil Pyska
     */
    public static void main(String[] args) {
        Random r = new Random();

        int[] randomNumbers=new int[]{r.nextInt(20)+1,r.nextInt(10)+1,r.nextInt(10)+1};
        int result=0;
        
        int firstN=randomNumbers[r.nextInt(3)];
        int secondN=randomNumbers[r.nextInt(3)];
        int thirdN=randomNumbers[r.nextInt(3)];
        
        //String[] operators = new String[]{"+","-","*","/"};

        System.out.println(firstN+" "+secondN+" "+thirdN+" = ");
        
        System.out.println("Pierwszy znak w działaniu:");
        Scanner sc=new Scanner(System.in);
        
                
        switch(sc.nextInt()){
            case 0:
                result+=firstN+secondN;
                break;
            case 1:
                result-=firstN-secondN;
                break;
            case 2:
                result*=firstN*secondN;
                break;
            case 3:
                result/=firstN/secondN;
                break;
        }
        
        System.out.println("Drugi znak w działaniu:");
        
        switch(sc.nextInt()){
            case 0:
                result += thirdN;
                break;
            case 1:
                result -= thirdN;
                break;
            case 2:
                result *= thirdN;
                break;
            case 3:
                result /= thirdN;
                break;
        }
        
        
        
        
    }
    
}
