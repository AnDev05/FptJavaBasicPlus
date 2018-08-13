package datatype;

/**
 *
 * @author Admin
 */
public class MyString {
    
    public static void main(String[] args) {
        String str="Hello world!"; //String literal
        
        str=str.concat("I'm ");
        str+="Jav";
        
        str=str.toUpperCase();
        System.out.println(str);
        
        String helloStr=new String("Hello world"); //Using new key world
        
        helloStr=new String(new char[]{'a','b','c'});
        System.out.println(helloStr);
        
        
        String[] spl = str.split("\\s+");
        
        char[] charArray = str.toCharArray();
        
        
    }
}
