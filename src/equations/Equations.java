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
        int userResult=0;
        int firstN=0;
        int secondN=0;
        int thirdN=0;
        int score=0;
        
        System.out.println("Podaj jakie znaki należy umieść w działaniu, aby było prawdziwe(np. '++' lub '*+'");
        System.out.println("Uwaga! Wynik dzielenia z resztą, to liczba całkowita np. 9/5=1, 4/5=0\n");
            
        while(true){
            firstN=r.nextInt(10)+1;
            secondN=r.nextInt(10)+1;
            thirdN=r.nextInt(10)+1;
            
            switch(r.nextInt(16)){
                case 0:
                    result=firstN+secondN+thirdN;
                    break;
                case 1:
                    result=firstN+secondN-thirdN;
                    break;
                case 2:
                    result=firstN+secondN*thirdN;
                    break;
                case 3:
                    result=firstN+secondN/thirdN;
                    break;
                case 4:
                    result=firstN-secondN+thirdN;
                    break;
                case 5:
                    result=firstN-secondN-thirdN;
                    break;
                case 6:
                    result=firstN-secondN*thirdN;
                    break;    
                case 7:
                    result=firstN-secondN/thirdN;
                    break;    
                case 8:
                    result=firstN*secondN+thirdN;
                    break;
                case 9:
                    result=firstN*secondN-thirdN;
                    break;
                case 10:
                    result=firstN*secondN*thirdN;
                    break;
                case 11:
                    result=firstN*secondN/thirdN;
                    break;
                case 12:
                    result=firstN/secondN+thirdN;
                    break;
                case 13:
                    result=firstN/secondN-thirdN;
                    break;
                case 14:
                    result=firstN/secondN*thirdN;
                    break;
                case 15:
                    result=firstN/secondN/thirdN;
                    break;  
                }
                

            System.out.println(firstN+" "+secondN+" "+thirdN+" = "+result+ " ?");
            Scanner sc=new Scanner(System.in);
        
        
            switch(sc.next()){
                case "++":
                    userResult=firstN+secondN+thirdN;
                    break;
                case "+-":
                    userResult=firstN+secondN-thirdN;
                    break;
                case "+*":
                    userResult=firstN+secondN*thirdN;
                    break;
                case "+/":
                    userResult=firstN+secondN/thirdN;
                    break;
                case "-+":
                    userResult=firstN-secondN+thirdN;
                    break;
                case "--":
                    userResult=firstN-secondN-thirdN;
                    break;
                case "-*":
                    userResult=firstN-secondN*thirdN;
                    break;    
                case "-/":
                    userResult=firstN-secondN/thirdN;
                    break;    
                case "*+":
                    userResult=firstN*secondN+thirdN;
                    break;
                case "*-":
                    userResult=firstN*secondN-thirdN;
                    break;
                case "**":
                    userResult=firstN*secondN*thirdN;
                    break;
                case "*/":
                    userResult=firstN*secondN/thirdN;
                    break;
                case "/+":
                    userResult=firstN/secondN+thirdN;
                    break;
                case "/-":
                    userResult=firstN/secondN-thirdN;
                    break;
                case "/*":
                    userResult=firstN/secondN*thirdN;
                    break;
                case "//":
                    userResult=firstN/secondN/thirdN;
                    break;  
        
            }
            
            if(result==userResult){
                System.out.println("Działanie jest poprawne!\n");
                score++;
                System.out.println("Twój wynik: "+score+"\n");
            }
            else{
                System.out.println("Wynik: "+userResult+" jest niepoprawny!\n");
                score=0;
                System.out.println("Twój wynik: "+score+"\n");
            }
        }
    }
    
}
