package abstractfactory;

public class Main {

    public static void main(String[] args) {
        Vaatetus jasperinVaatetus = new Vaatetus(new AdidasTehdas()); 
        
        System.out.println("Jasperin vaatteet:");
        System.out.println(jasperinVaatetus);
        
        System.out.println("");
                
        jasperinVaatetus.vaihda(new BossTehdas());
        
        System.out.println("Jasperin vaatteet vaihdon jälkeen:");
        System.out.println(jasperinVaatetus);
    }
    
}
