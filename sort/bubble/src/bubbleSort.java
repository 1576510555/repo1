import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 6, 8, 0, 3, 7,3,556,1,3};

        int temp;

        boolean flag = false;//定义一个标签，如果进行了交换，那么就把标签置为true，如果没有进行交换，跳出循环，
        for (int i = 0; i < arr.length-1; i++) {

            for (int j = 0;j < arr.length-1-i;j++){
                if(arr[j] > arr[j+1]){
                    flag = true;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(!flag){
                break;
            }
//            else
//                flag = false;
        }
        System.out.println(Arrays.toString(arr));
    }


}
