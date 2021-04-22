public class Controller {

    private Model m;
    private View v;

    

    public Controller(Model model, View view){
        this.m = model;
        this.v = view;
     }

    public void setCode(String code){
        m.setCode(code);		
     }
  
     public String getCode(){
        return m.getCode();		
     }

     public void updateView(){				
        v.show(m.getCheck());
     }
     public void updateBox(){				
        v.showBox(m.getBox());
     }
     public void updateAge(){				
        v.showAge(m.getAge());
     }

     public void showHome(){				
        
        v.Home();
        m.scanCode();
        checkCode();
        checkBox();
     }
    
     public void checkCode(){
        String c = m.getCode();
        if(c.length()==6){
            for(int i = 0;i<2;i++){
                char ch = c.charAt(i);
                if (Character.isLetter(ch))
                    m.setCheck("Pass");
                else{
                    m.setCheck("Error");
                    return;
                }
            }
            for(int i = 2;i<6;i++){
                char ch = c.charAt(i);
                if (Character.isDigit(ch))
                    m.setCheck("Pass");
                else{
                    m.setCheck("Error");
                    return;
                }
            }
        }
        else
            m.setCheck("Error");
    }
    public void checkBox(){
        String[] box=m.getBox();
        String code=m.getCode();
        int count=0;
        int cblank=2;
        
        for(int i=0;i<16;i++){ //เช็คว่ารหัสประเทศ2ตัวแรกตรงกันหรือไม่
            count=0;
            for(int j = 0;j<2;j++){
                char c1 = box[i].charAt(j);
                char c2 = code.charAt(j);
                
                if(c1==c2){
                    count++;
                    
                }
                if(c1=='X'||c1=='Y'){
                    cblank--;
                }
            
            }
            if(count==2){
                m.setCage(m.getCage()+1);
                
                m.setBox(code,i);
                m.setAge(m.getCage(), i);
                
                return;
            }
            if(cblank==0){
                m.setCage(m.getCage()+1);
                
                m.setBox(code,i);
                m.setAge(m.getCage(), i);
                return;
            }
            
        }
    }
}