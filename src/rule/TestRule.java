package rule;

/**
 *
 * @author Admin
 */
public class TestRule {
    
    
    //Varriable
    private int count;
    private String studentName;
    private char dateOfBirth;
    
    
    //Constant
    public static final double PI=3.14; 
    public static final String HELLO_WORLD="Hello World"; 
    
    
    //Method
    public String getStudentName(){
        return studentName;
    }
    
    public void setStudentName(String studentName){
        this.studentName=studentName;
    }
    
    public double calculateArea(double width,double height){
        return width*height;
    }
}
