package core;

/**
 *
 * @author Admin
 */
public class ArithmeticAndBitOperators {
    
    //Arithmetic operators
    private int getSum(int a,int b){
        return a+b;
    }
    
    private int getSubtraction(int a,int b){
        return a-b;
    }
    
    private int getMultiplication(int a,int b){
        return a*b;
    }
    
    private int getDivision(int a,int b){
        return a/b;
    }
    
    
    private int getModulus(int a,int b){
        return a%b;
    }
    
    private int getIncrement(int a){
        return a++;
    }
    
    private int getDecrement(int a){
        return a--;
    }

    //Bit ArithmeticAndBitOperators
    private int getBitWise(int a,int b){
        return a&b;
    }
    
    private int getBitOr(int a,int b){
        return a|b;
    }
    
    private int getXOr(int a,int b){
        return a^b;
    }
    
    private int getBitCom(int a){
        return ~a;
    } 
    
    private int getLeftShiftByOne(int a){
        return a<<1;
    } 
    
    private int getRightByOne(int a){
        return a>>1;
    } 
    
    
    private int getFillRightShift(int a){
        return a>>>1;
    } 
    
    
   
    
    public static void main(String[] args) {
        int a=60;
        int b=13;
        
        ArithmeticAndBitOperators opera=new ArithmeticAndBitOperators();
        
        System.out.println("Sum: "+opera.getSum(a, b));
        System.out.println("Subtraction: "+opera.getSubtraction(a, b));
        System.out.println("Division: "+ opera.getDivision(a, b));
        System.out.println("Modulus: "+opera.getModulus(a, b));
        System.out.println("Multiplication: "+opera.getMultiplication(a, b));
        System.out.println("Xor: "+opera.getXOr(a, b));
        System.out.println("Or: "+opera.getBitOr(a, b));
        System.out.println("Bitwise: "+opera.getBitWise(a, b));
        System.out.println("Bit com: "+opera.getBitCom(a));
        System.out.println("Fill right shift: "+opera.getFillRightShift(a));
        System.out.println("Shift right :"+opera.getRightByOne(a));
        System.out.println("Shift left: "+opera.getLeftShiftByOne(a));
        System.out.println("Decrement: "+opera.getDecrement(a));
        System.out.println("Increment: "+opera.getIncrement(a));
        
        
    }
}
