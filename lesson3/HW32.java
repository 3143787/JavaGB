//Пусть дан произвольный список целых чисел, удалить из него чётные числа

import java.util.ArrayList;
public class HW32
 {

    public static void removeeven(int[] array) {
        

        ArrayList<Integer> Arr = new ArrayList<Integer>();
        for (int element : array) {
            if ((element)%2 ==0){
                continue;
        } else { Arr.add(element);
        }
        
      
        }
        System.out.print(Arr);
    }
}

