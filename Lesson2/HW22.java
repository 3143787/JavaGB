
public class HW22
 {

    public static void print(String[] array) {
        StringBuffer str = new StringBuffer("");
        for (int index = 0; index < array.length; index++) {
            if ((index)%6 ==0){
                array[index]="Студент";                
            }
            if ((index+2)%6 ==0){
                array[index]="получил";                
            }
            if ((index+4)%6 ==0){
                array[index]="по предмету";                
            }
            if ((index+1)%6 ==0){
                str.append( array[index] + '\n');
            }else{
            str.append( array[index] + ' ');
            }
        }
        
        System.out.print(str); 
    }

    public static void  sort(String str) {

       

        
        str = str.replace("{", "");
        str = str.replace("}", "");
        str = str.replace("[", "");
        str = str.replace("]", "");
        str = str.replace("\"", "");
        str = str.replace(":", ",");
        String[] spl = str.split(",");          
        print(spl);
       
        }
    }

