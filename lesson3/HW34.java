//Реализовать разность массивов и симметрическую разность

import java.util.List;
import java.util.Random;
import java.util.ArrayList;
public class HW34
 {

    public static void minus() {
        System.out.print("\nразность массивов");
        Random random = new Random();
        List<Integer> Arr1 = new ArrayList<>();
        List<Integer> Arr2 = new ArrayList<>();
        List<Integer> Arr = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Arr1.add(random.nextInt(10));
            Arr2.add(random.nextInt(10));
            }
            System.out.print("\n"+ Arr1);
            System.out.print("\n" +Arr2);
        
         for (int i = 0; i < Arr1.size(); i++) {
            Arr.add(Arr1.get(i)- Arr2.get(i));

         }    
        
        System.out.print("\n" +Arr);
        }
        
        public static void symmetricDifference()   {
            System.out.print("\nсимметрическая разность массивов");
            Random random = new Random();
            List<Integer> Arr1 = new ArrayList<>();
            List<Integer> Arr2 = new ArrayList<>();
            List<Integer> Arr = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                Arr1.add(random.nextInt(5));
                Arr2.add(random.nextInt(5));
                }
                System.out.print("\n"+ Arr1);
                System.out.print("\n" +Arr2);
            
                for (int element1 : Arr1) {                    
                    int schet=0;                    
                    for (int element2 : Arr2){
                        if (element1 == element2){
                            schet +=1;
                        }
                    }
                    for (int element2 : Arr) {
                        if (element1 == element2) {
                            schet +=1;
                        }
                    }
                    if (schet == 0) {
                        Arr.add(element1);
                    }
                                  
                       
                }
                for (int element1 : Arr2) {                    
                    int schet=0;                    
                    for (int element2 : Arr1){
                        if (element1 == element2){
                            schet +=1;
                        }
                    }
                    for (int element2 : Arr) {
                        if (element1 == element2) {
                            schet +=1;
                        }
                    }
                    if (schet == 0) {
                        Arr.add(element1);
                    }                   
                }   
            
            System.out.print("\n" +Arr);
            
        

        // System.out.println("\n"+Arr);
        // Collections.sort(Arr);
        // int min = Arr.get(0);
        // int max = Arr.get(Arr.size()-1);
        // int sum=0;
        // for (int element : Arr) {                     
        //     sum=sum + element;
        // }

        //System.out.print("минимальное = " + min+  "\nмаксимальное = " + max +  "\nсреднее арифметическое= " + sum/Arr.size() );
    }
}

