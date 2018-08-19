package datatype;

import entity.Student;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class MyArray {
    public static void main(String[] args) {
        
        int []intArray=new int[20];
        char []alphabet={'a','b','c','d'};
        
        //Index of array start at 0 and end at n-1 (n is length of array)
        
        System.out.println(intArray[12]);
        System.out.println(alphabet[0]);
        System.out.println(alphabet[3]);
        
        //Change value at index
        
        intArray[12]=12;
        System.out.println(intArray[12]);
        
        //Traverse
        for (char c : alphabet) {
            System.out.print(c+" ");
        }
        System.out.println();
        for (int i = 0; i < alphabet.length; i++) {
            char c = alphabet[i];
            System.out.print(c+" ");     
        }
        System.out.println();
        
        //Object array
        
        Student []studentArray=new Student[20];
        
        Student s1=new Student("SE1111", "An", 21);
        
        studentArray[0]=s1;
        
        System.out.println(studentArray[0].getName());
        
        System.out.println(studentArray[0].getAge());
        
        
        //Collection array
        
        List<Student> []listStudent=new ArrayList[20];
        
    }
}
