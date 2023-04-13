import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;
public class HW21
 {
    //private static final Logger LOG = Log.log(HW12.class.getName());
    private static final Logger logger = Logger.getGlobal();
    

    public static void rungive(int[] array, int n) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Задайте масив из "  + n + " чисел: \n");
        for (int index = 0; index < n; index++) {
            array[index] = iScanner.nextInt();   
        }     
    }
    public static void runprint (int[] array) {
        StringBuffer str = new StringBuffer("[");
        for (int index = 0; index < array.length-1; index++) {
            str.append( Integer.toString(array[index]) + ',');
        }
        str.append(Integer.toString(array[array.length-1]) +']');
        System.out.print("\n" + str+ "  ");      

    }
    public static int[] bubble (int[] array) {
        int sumchange=0;
        int change = 0;
        for (int index = 1; index < array.length; index++) {
            if (array[index] < array[index-1]) {
               change = array[index-1];
               array[index-1]=array[index];
               array[index]=change;
               sumchange++;
            }

        }
        runprint(array);
        //System.out.printf("Количество замен = " + sumchange + "\n"); 
        logger.info("Количество замен = " + sumchange + "\n"); 
        if (sumchange>0){return bubble(array);}
        else {return array;}


    }
    
    public static void write(int[] array){
        
    try(FileWriter in = new FileWriter("log.txt" )) {
        int[] data = array;     
        for (int datum : data) {
           in.append(Integer.toString(datum));
        } 
        System.out.println("Recorded!:)");
        throw new RuntimeException("Complete");
    } catch (IOException e) {
        //LOG.log(Level.INFO, e.getMessage() );
        throw new RuntimeException(e);
    }
 }
 



}