
import java.util.Arrays;
public class main {
    public static void main(String[] args) {
    // Scanner iScanner = new Scanner(System.in);
    // System.out.printf("Задайте количество чисел в масиве ");
    // int n = iScanner.nextInt();   

    int[] sortArr = {10,15,23,65,89,75,14,25};
    int[] result = HW31.mergeSort(sortArr);
    System.out.println(Arrays.toString(result));
    HW32.removeeven(sortArr);
    HW33.maxmin();
    HW34.minus();
    HW34.symmetricDifference();

    
   
}
}
