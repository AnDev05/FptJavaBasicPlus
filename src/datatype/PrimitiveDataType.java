package datatype;

/**
 *
 * @author Admin
 */
public class PrimitiveDataType {
    //Global varriable, auto init default value
    private static boolean isFull;
    private static byte myByte;
    private static short myShort;
    private static char firstChar;
    private static int count;
    private static long myLong;
    private static double dNumber;
    private static float fNumber;
    
    
    static final double PI=3.14;
    
    private static void printDefaultValue(){
        System.out.println("*************Default Value**************");
        System.out.println("boolean: "+isFull);
        System.out.println("byte: "+myByte);
        System.out.println("short: "+myShort);
        System.out.println("char: "+firstChar);
        System.out.println("int: "+count);
        System.out.println("long: "+myLong);
        System.out.println("double: "+dNumber);
        System.out.println("float: "+fNumber);
    }
    
    private static void printCurrentValue(){
        System.out.println("*************Current Value**************");
        System.out.println("boolean: "+isFull);
        System.out.println("byte: "+myByte);
        System.out.println("short: "+myShort);
        System.out.println("char: "+firstChar);
        System.out.println("int: "+count);
        System.out.println("long: "+myLong);
        System.out.println("double: "+dNumber);
        System.out.println("float: "+fNumber);
    }
    
    public static void setValue(){
        count=10;
        firstChar='a';
        myByte=127;
        
        int localVarriable=200;
        count=localVarriable;
    }
    
  
    
    
    
    public static void main(String[] args) {
        printDefaultValue();
        setValue();
        printCurrentValue();
    }
    
}
