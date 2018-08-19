package core;

/**
 *
 * @author Admin
 */
public class LogicalOperators {
    
    
    private static boolean checkTriangle(double a,double b,double c){
//        if(a+b<=c||a+c<=b||b+c<=a)
//            return false;
//        return true;
//        if (a+b>c&&a+c>b&&b+c>a)
//            return true;
//        return false;
        
        
        //return a+b>c&&a+c>b&&b+c>a;
        return !(a+b<=c||a+c<=b||b+c<=a);
    }
    
    public static void main(String[] args) {
       double a=1;
       double b=13.5;
       double c=12;
       
       if(checkTriangle(a, b, c))
            System.out.println("Triangle");
       else
            System.out.println("Not a triangle");
    }
    
}