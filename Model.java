import java.util.Scanner;


public class Model {
    Scanner scanIn = new Scanner(System.in);
    private String code;
    private String check;
    private int cage;
    private int[] age = new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    private String[] box = new String[] {"XY000", "XY000", "XY000","XY000","XY000", "XY000", "XY000","XY000","XY000", "XY000", "XY000","XY000","XY000", "XY000", "XY000","XY000"};
    


    public String getCode() {
        return code;
     }
     
     public void setCode(String code) {
        this.code = code;
     }

     public int getCage() {
      return cage;
   }
   
   public void setCage(int cage) {
      this.cage = cage;
   }

     public int[] getAge() {
        return age;
     }
     
     public void setAge(int age,int position) {
        
        this.age[position] = age;
        
     }

     public void scanCode() {
        code = scanIn.nextLine();
        
     }

     public String getCheck() {
        return check;
     }
     
     public void setCheck(String check) {
        this.check = check;
     }

     public String[] getBox() {
        return box;
     }
     
     public void setBox(String code,int position) {
        
        this.box[position] = code;
        
     }
     
}