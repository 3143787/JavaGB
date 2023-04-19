/*Реализуйте очередь с помощью LinkedList со следующими методами:
• enqueue() — помещает элемент в конец очереди,
• dequeue() — возвращает первый элемент из очереди и удаляет его,
• first() — возвращает первый элемент из очереди, не удаляя. */
import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;

public class main {
    public static void main(String[] args) {

    List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);        
        System.out.println(HW41.reverseList(list1));
        LinkedList<Integer> list2 = new LinkedList<Integer>();;
        list2.add(1);   
        list2.add(2);
        list2.add(3);
        list2.add(4);
        System.out.println(list2);
        
        HW42.enqueue(list2, 7);
        System.out.println(list2);
        HW42.dequeue(list2);
        System.out.println(list2);
        HW42.first(list2);
        System.out.println(list2);
}
}
