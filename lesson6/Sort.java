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
