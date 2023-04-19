//Пусть дан произвольный список целых чисел, удалить из него чётные числа


import java.util.LinkedList;

public class HW42


{
    public static void enqueue(LinkedList<Integer> list, int item) {
        list.offer(item);
    }

    public static void dequeue(LinkedList<Integer> list) {
        System.out.println(list.removeFirst());
    }

    public static void first(LinkedList<Integer> list) {
        System.out.println(list.getFirst());
    }
 
    
    }


