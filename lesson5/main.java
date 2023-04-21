/*Реализуйте очередь с помощью LinkedList со следующими методами:
• enqueue() — помещает элемент в конец очереди,
• dequeue() — возвращает первый элемент из очереди и удаляет его,
• first() — возвращает первый элемент из очереди, не удаляя. */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.LinkedList;

public class main {
    public static void main(String[] args) {
        
    Map<String,String> phonelist = new HashMap<>();
    
        
    HW51.Phonelist(phonelist);
    
    String[] list= {
         "Иван Иванов"
        ,"Светлана Петрова"      
        ,"Кристина Белова"        
        ,"Анна Мусина"        
        ,"Анна Крутова"        
        ,"Иван Юрин"       
        ,"Петр Лыков"        
        ,"Павел Чернов"
        ,"Иван Иванов"        
        ,"Петр Чернышов"
        ,"Мария Федорова"
        ,"Марина Светлова"     
        ,"Мария Савина"
        ,"Иван Иванов"
        ,"Мария Рыкова"
        ,"Анна Крутова"
        ,"Марина Лугова"
        ,"Анна Владимирова"
        ,"Петр Лыков"
        ,"Иван Мечников"       
        ,"Петр Петин"
        ,"Петр Лыков"
        ,"Иван Ежов"};
    HW52.scanner(list);
        
}
}
