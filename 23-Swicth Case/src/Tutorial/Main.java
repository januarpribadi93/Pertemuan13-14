/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorial;
import java.util.*;
/**
 *
 * @author Asus X 441B
 */
public class Main {
// switch case
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input;
        
Scanner inputUser = new Scanner(System.in);

        
System.out.print("panggil nama: ");
        
input = inputUser.next();

        
// ekspresinya berupa satuan (int,long,byte,short), String, atau enum
        
switch(input){
            
case "otong":
                
System.out.println("saya otong dan hadir Bos!!!");
                
break;
            
case "ucup":
                
System.out.println("saya ucup dan hadir Bos!!!!");
                
break;
            
case "mario":
                
System.out.println("saya mario dan hadir Bos!!!!");
                
break;
            
default:
                
System.out.println(input + " tidak hadir Bos!!!");
        
}

        
System.out.println("selesai program");
    }
}
