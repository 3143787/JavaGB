//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернёет «перевёрнутый» список.
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;
 
// Программа для обращения `ArrayList` в Java
class HW51
{   static Scanner scanner = new Scanner(System.in);

    public static<T> Map<String, String> Phonelist(Map<String, String> phonelist)

    {   
        
        
        System.out.println("Добавить запись? y");
        String question = scanner.nextLine();
        switch (question) {
            case "y":

            addphone(phonelist);
            Phonelist(phonelist);
            default:
                break;
                
        }
            
            

            
        //}
        
        
        
        return phonelist;
    }
    public static void addphone(Map<String, String> phonelist){
            String name;
            String phone;
            System.out.println("Ввведите имя");
            name = scanner.nextLine();
            System.out.println("Ввведите телефон");
            phone= scanner.nextLine();
            if (phonelist.containsKey(name)){
                phone =phone +";"+ phonelist.get(name);
            }
            phonelist.put(name, phone);
            
            for (Map.Entry<String, String> entry : phonelist.entrySet()) {
                System.out.println(entry.getKey()+":"+ entry.getValue());
            }

    }
    
    }