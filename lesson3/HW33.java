//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое этого списка.

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;
public class HW33
 {

    public static void maxmin() {
        Random random = new Random();
        List<Integer> Arr = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Arr.add(random.nextInt(10));
        }
        

        System.out.println("\n"+Arr);
        Collections.sort(Arr);
        int min = Arr.get(0);
        int max = Arr.get(Arr.size()-1);
        int sum=0;
        for (int element : Arr) {                     
            sum=sum + element;
        }

        System.out.print("минимальное = " + min+  "\nмаксимальное = " + max +  "\nсреднее арифметическое= " + sum/Arr.size() );
    }
}

