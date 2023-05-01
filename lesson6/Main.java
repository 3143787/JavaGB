package lesson6;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Notebook model1 = new Notebook("Acer", "Aspire3", "15.6", "i3-10100", "Geforce1050", "35000");
        Notebook model2 = new Notebook("Acer", "Aspire3", "17.3", "i3-11000", "Geforce1650", "40000");
        Notebook model3 = new Notebook("Acer", "Aspire5", "17.6", "i3-10100", "Geforce1050", "40000");
        Notebook model4 = new Notebook("HP", "Laptop", "15.6", "i5-1235", "Geforce1650", "40000");
        Notebook model5 = new Notebook("HP", "Victus", "17.3", "i7-12100", "Geforce3050", "55000");
        Notebook model6 = new Notebook("Asus", "TUF", "17.3", "i7-12100", "Geforce3050", "55000");
        

        
        Set<Notebook>  models = new HashSet<>();
        models.add(model1);
        models.add(model2);
        models.add(model3);
        models.add(model4);
        models.add(model5);
        models.add(model6);
        System.out.println(models);
        Sort operation = new Sort(models);
        
       operation.start();
    }
            
            
            
    
        
       
        
    
}

