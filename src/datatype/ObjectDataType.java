package datatype;

import entity.Student;

/**
 *
 * @author Admin
 */
public class ObjectDataType {
    
    
    
    public static void main(String[] args) {
        //Array data type
        int []array=new int [10];
        Object []objArray=new Object[20];
        
        //String 
        
        String myName="Nguyen Van A";
        
        System.out.println(myName);
        
        
        //Class
        Student student=new Student();
        
        System.out.println(student.getAge());
        
    }
}
