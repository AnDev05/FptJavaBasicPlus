package core;

/**
 *
 * @author Admin
 */
public class RelationalOperators {
    
    private static void checkNumberEqual(int a,int b){
        if(a>b){
            System.out.println(a+" > "+b);
        }else if(a<b){
            System.out.println(a+ " < "+b);
        }else{
            System.out.println(a+"=" +b);
        }
    }
    
    public static void main(String[] args) {
        int a=12;
        int b=13;
        
        checkNumberEqual(a, b);
        
//        --b;
//        b--;
//        
//        checkNumberEqual(a, b);
        
        int c=(--b)+a; //24
        
        int d=b+(--a); //23

//        int c=(b--)+a; //25
//
//        int d=b+(a--); //24
//        
        checkNumberEqual(d, c);
        
    }
    
}
