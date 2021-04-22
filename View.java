public class View {
    public void show(String check){
        System.out.println("Check : "+check);
        
    }
    
    public void showBox(String box[]){
        
        for(int i=0;i<16;i++){
            System.out.println("Box "+(i+1)+":"+box[i]);
        }
        
    }

    public void showAge(int age[]){
        
        for(int i=0;i<16;i++){
            System.out.println("Age "+(i+1)+":"+age[i]);
        }
        
    }

    public void Home(){
        System.out.println("Enter Code :");
    }
}