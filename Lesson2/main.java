import java.util.Scanner;
public class main {
    public static void main(String[] args) {
    Scanner iScanner = new Scanner(System.in);
    System.out.printf("Задайте количество чисел в масиве ");
    int n = iScanner.nextInt();   
    int[] ray = new int[n];
    HW21.rungive(ray, n);
    HW21.runprint(ray); 
    HW21.bubble( ray);
    String json = new String("[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}, {\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}, {\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]");
    HW22.sort(json);
    HW21.write(ray); 
}
}
