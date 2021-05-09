
import java.sql.PseudoColumnUsage;
import java.util.Arrays;

public class insertSort {

    public static void main(String[] args) {

        int [] arr = {23,546,6,234,657,32,24,51,21};

        for (int i = 1; i < arr.length; i++) {
            int insertVal = arr[i];
            int insertIndex = i-1;
            while(insertIndex >= 0 && insertVal < arr[insertIndex]){
                arr[insertIndex+1] = arr[insertIndex];
                insertIndex--;
            } arr[insertIndex+1] = insertVal;
        }
        System.out.println(Arrays.toString(arr));

    }
    public void main(){
        for (int i = 0; i < 100; i++) {
            System.out.println("hi");
        }
    }
    public void eat(){

    }

}
