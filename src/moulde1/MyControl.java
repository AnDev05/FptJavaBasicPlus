package moulde1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class MyControl {
    
    private static String isMature(int age){
        return age>18 ? "You are mature!": "Not mature!";
    }
    
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int age;
        
        System.out.print("Enter your age: ");
        
        age=scanner.nextInt();
        
        if (age > 60) {
            System.out.println("You look very old!");
        } else if (age > 30 && age < 60) {
            System.out.println("You look pretty old!");
        } else if (age > 18 && age < 30) {
            System.out.println("You look pretty young!");
        } else {
            System.out.println("You are kid!");
        }
        
        System.out.println(isMature(age));
        
    }
}
