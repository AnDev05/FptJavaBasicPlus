package core;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class MyLoop {
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int []array=new int[10];
        
        for (int i = 0; i < array.length; i++) {
            array[i]=scanner.nextInt();
        }
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        
        for (int i : array) {
            System.out.print(i+ " ");
        }
        
        int sum=0;
        for (int i = 0;; i++) {
            sum+=array[i];
            if(sum>100||i>=array.length)
                break;
        }
        
        System.out.println();
        System.out.println(sum);
        
        sum=0;
        
        for (int i = 0; i < array.length&&sum<100; i++) {
            sum+=array[i];
        }
        
        System.out.println(sum);
        
        //While(true)
//        for (;;) {
//            
//        }
        
        int i=0;
        sum=0;
        
        while(sum<100){
            i++;
            sum+=array[i];
        }
        
        System.out.println(sum);
        
        int number;
        boolean isPrime=true;
        
        do{
            System.out.print("Enter number: ");
            number=scanner.nextInt();
            
            for (int j = 2; j < Math.sqrt(number); j++) {
                if(number%2==0){
                    isPrime=false;
                }
            }
            
        }while(!isPrime);
        
        System.out.println("Prime: "+number);
    }
    
    
}
