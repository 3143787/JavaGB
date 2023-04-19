//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернёет «перевёрнутый» список.
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
 
// Программа для обращения `ArrayList` в Java
class HW41
{
    public static<T> List<T> reverseList(List<T> list)
    {
        List<T> reverse = new ArrayList<>(list);
        Collections.reverse(reverse);
        return reverse;
    }
 
    
    }
