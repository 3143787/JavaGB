//Пусть дан произвольный список целых чисел, удалить из него чётные числа


import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;

public class HW52


{   public static void scanner(String[] list) {
    Map<String,Integer> namelist = new HashMap<>();
    for (String element : list) {
        String[] fullname = element.split(" ");
        String firstname = fullname[0];
        int sumname=1;
        
        if (namelist.containsKey(firstname)){
            sumname +=namelist.get(firstname);
        }
        namelist.put(firstname, sumname);
        
    }
    String n;
    for (Entry<String, Integer> entry : namelist.entrySet()) {
        if (1<entry.getValue() && entry.getValue()<5) n = " раза";
        else n = " раз";
        System.out.println("Имя "+entry.getKey()+" встречается "+ entry.getValue()+ n);
    }
    }
        
        
    }
 
    



