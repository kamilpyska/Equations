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

        
        int result=0;
        
        int firstN=r.nextInt(15)+1;
        int secondN=r.nextInt(15)+1;
        int thirdN=r.nextInt(15)+1;
        
        //String[] operators = new String[]{"+","-","*","/"};

        
        System.out.println("Podaj jakie znaki należy umieść w działaniu, aby było prawdziwe(np. '++' lub '*+'");
        System.out.println(firstN+" "+secondN+" "+thirdN+" =  ?");
        Scanner sc=new Scanner(System.in);
        
        
        switch(sc.next()){
            case "'++'":
                result=firstN+secondN+thirdN;
                break;
            case "'+-'":
                result=firstN+secondN-thirdN;
                break;
            case "'+*'":
                result=firstN+secondN*thirdN;
                break;
            case "'+/'":
                result=firstN+secondN/thirdN;
                break;
            case "'-+'":
                result=firstN-secondN+thirdN;
                break;
            case "'--'":
                result=firstN-secondN-thirdN;
                break;
            case "'-*'":
                result=firstN-secondN*thirdN;
                break;    
            case "'-/'":
                result=firstN-secondN/thirdN;
                break;    
            case "'*+'":
                result=firstN*secondN+thirdN;
                break;
            case "'*-'":
                result=firstN*secondN-thirdN;
                break;
            case "'**'":
                result=firstN*secondN*thirdN;
                break;
            case "'*/'":
                result=firstN*secondN/thirdN;
                break;
            case "'/+'":
                result=firstN/secondN+thirdN;
                break;
            case "'/-'":
                result=firstN/secondN-thirdN;
                break;
            case "'/*'":
                result=firstN/secondN*thirdN;
                break;
            case "'//'":
                result=firstN/secondN/thirdN;
                break;  
        }
        
        System.out.println("Wynik: "+result);
        
        
    }
    
}
