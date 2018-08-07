
package moulde1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class TestException {
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        int year;
        
        do{
            try{
                System.out.print("Enter year: ");
                year=scanner.nextInt();
                
                System.out.println(year);
            }catch(NumberFormatException e){
                System.out.println("Error!");
            }
            
            System.out.println("End of program");
        }while(true);
        
        
    }
    
}
