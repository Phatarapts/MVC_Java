public class Demo {
    public static void main(String[] args) {
        
        
        Model m = new Model();
        View v = new View();
        Controller c = new Controller(m,v);
        
        c.showHome();
        c.updateView();
        c.updateBox();
        c.updateAge();
        
        c.showHome();
        c.updateView();
        c.updateBox();
        c.updateAge();
    }

    
}