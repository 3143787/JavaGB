package lesson6;
import java.util.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Sort {
    private Set<Notebook> notebooks = new HashSet<>();
    private static Scanner scanner = new Scanner(System.in);
    public Sort(Set<Notebook> notebooks) {
        this.scanner = new Scanner(System.in);
        this.notebooks = notebooks;
        
    }

    

    public List<String> propertiesForFilter(){ //список критериев
        List<String> list = new ArrayList<>();
        list.add("brand");
        list.add("series");
        list.add("diagonal");
        list.add("cpu");
        list.add("graphicscard");
        list.add("price");

        return list;
    }


    public int getCriteria(){
        
        String text = "Введите цифру, значение критерия: ";

        List<String> properties = propertiesForFilter();

        for (int i = 0; i < properties.size(); i++)
        {
            text += "\n" + (i + 1) + ". " + properties.get(i);
        }

        System.out.println(text);

        int value = scanner.nextInt();
        
        

        return value;
    }
    
    
    public int getOperations(){

        String text = "Выберите опрерацию: \n " +
                "1. Добавить критерий \n " +                
                "2. Завершить";

        System.out.println(text);

        int answer = scanner.nextInt();

        return answer;
    }
    public void start(){

        Notebook criterionnote;
        boolean flag = true;
        while (flag){

            int operation = getOperations();
            Scanner scanner2 = new Scanner(System.in);
            if (operation==2){
                flag = false;
                scanner.close();
                continue;
                }else if(operation==1){

                int value = getCriteria();
                
                String criterion;
                criterion = scanner2.nextLine();
                if (value==1){
                    System.out.println("Введите значение выборки");
                    
                    criterionnote = new Notebook( criterion, " "," ", " "," "," ");
                    for (Notebook element : notebooks) {                                     
                        if (element.equals(criterionnote)) {
                            System.out.println(element);
                    }
                              
                } 
                }   else if (value==2) { 
                    System.out.println("Введите значение выборки");                   
                    criterionnote = new Notebook( " ", criterion," ", " "," "," ");
                    for (Notebook element : notebooks) {
                    
                        if (element.equals(criterionnote)) {
                            System.out.println(element);
                    }
                }
                } else if (value==3) {
                    System.out.println("Введите значение выборки");
                    criterionnote = new Notebook(" ", " ",criterion, " "," "," ");
                    for (Notebook element : notebooks) {
                    
                        if (element.equals(criterionnote)) {
                            System.out.println(element);
                    }
                }
                } else if (value==4) {
                    System.out.println("Введите значение выборки");
                    criterionnote = new Notebook(" ", " ", " ",criterion," "," ");
                    for (Notebook element : notebooks) {
                    
                        if (element.equals(criterionnote)) {
                            System.out.println(element);
                    }
                }
                } else if (value==5) {
                    System.out.println("Введите значение выборки");
                    criterionnote = new Notebook( " ", " ", " "," ",criterion," ");
                    for (Notebook element : notebooks) {
                    
                        if (element.equals(criterionnote)) {
                            System.out.println(element);
                    }
                }
                    
                }else if (value==6) {
                    System.out.println("Введите значение выборки");
                    criterionnote = new Notebook( " ", " ", " "," "," ",criterion);
                    for (Notebook element : notebooks) {
                    
                        if (element.equals(criterionnote)) {
                            System.out.println(element);
                    }
                }
                }
                
            
        }
    }
    }
    }



 
// class Criterion {

//     Object value;
//     Double minValue;
//     Double maxValue;
//     boolean isQuantitative;
//     String property;
// public Criterion(String property, boolean isQuantitative, Object value) {
//         this.property = property;
//         this.isQuantitative = isQuantitative;
//         this.value = value;
    
// }


// public static Criterion startGetting(Scanner scanner, String property, boolean isQuantitative) {

//     if (isQuantitative) {

                    
//         System.out.println("Выберите тип криетрия: " );
        
//         String text = scanner.next();

//         Criterion criterion = null;

//         System.out.println("Введите значение поиска: ");
//         int getValue = scanner.nextInt();
//         criterion = new Criterion(property, isQuantitative, getValue);
        
//         }

//         return criterion;
//     }
// }




    // public String[] descriptnote;

    // public Map<Integer, Notebook>    sort(Map<Integer, Notebook> notesort) {

    //     for (Map.Entry<Integer, Notebook> entry : notesort.entrySet()) { //for (Map.Entry<Integer, Notebook> entry : notesort.entrySet()) {
    //         String[] descriptnote = (String)entry.getValue().split(" ");
    //         System.out.println(descriptnote);

            

           
            
    //         } 
    //         return notesort;
             
    // }
    // @Override
    // public boolean equals(Object obj) {
    //     if (obj == this) {
    //         return true;
    //     }
    //     if (obj == null || obj.getClass() != this.getClass()) {
    //         return false;
    //     }
    //     return model.cpu.equals(this.cpu); 
    


    