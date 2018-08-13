package datatype;

/**
 *
 * @author Admin
 */
public class BoxUnBox {
    
    public static void main(String[] args) {
        
        //Integer
        
        Integer i = new Integer(20); //Boxing
        Integer z = 20; //Autoboxing
        
        i++;  //Unboxing
        
        System.out.println(i);
        
        int t=z.intValue(); //Unboxing
        
        t=z; //Autounboxing
        
        
        //Character
        
        char a='A';
        
        Character charObj='A';
        
        if(a==charObj){
            System.out.println("Equals"); 
        }else{
            System.out.println("Not equals");
        }
        
        System.out.println(Character.toLowerCase(a));
        
    }
    
}
