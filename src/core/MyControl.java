package core;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class MyControl {
    
    private static String isMature(int age){
        return age>18 ? "You are mature!": "Not mature!";
    }
    
    
    
    private static boolean checkAge(int age){
        if (age>18) {
            System.out.println("...........<3");
            return true;
        }
        return false;
    }
    
    private static boolean checkAge2(int age){
        return age>18;
    }
    private static String checkAge3(int age){
        return age>18?"Lay vo dc":"Khong lay vo duoc";
    }
    
    private static void calArea(int width,int height){
        if(width<0||height<0)
            return;
        int area=width*height;
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
