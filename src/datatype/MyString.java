package datatype;

/**
 *
 * @author Admin
 */
public class MyString {
  
    
    public static void main(String[] args) {
//        String str="Hello world!"; //String literal
//        
//        str=str.concat("I'm ");
//        str+="Jav";
//        
//        str=str.toUpperCase();
//        System.out.println(str);
//        
//        String helloStr=new String("Hello world"); //Using new key world
//        
//        helloStr=new String(new char[]{'a','b','c'});
//        System.out.println(helloStr);
//        
//        
//        String[] spl = str.split("\\s+");
//        
//        char[] charArray = str.toCharArray();
        
        
        String strX = "abc"; //String pool
        String strY = "abc"; //String pool
        
        System.out.println(strX==strY); //True
        
        String strT=new String("abc");
        String strZ=new String("abc");
        
        System.out.println(strT==strZ); //False
        
        System.out.println(strT.equals(strZ)); //True
    }
}
