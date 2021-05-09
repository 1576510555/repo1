import java.util.Arrays;

public class selectSort {

    public static void main(String[] args) {

        int [] arr = {34,55,2,426,67,43,1,7};

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            int min = arr[i];
            for (int j = i+1;j < arr.length;j++){
                if(min > arr[j]){
                    min = arr[j];//找到最小值，重置最小值
                    minIndex = j;
                }
            }
            if(minIndex != i ){
                arr[minIndex] = arr[i];//把最小值放入第i索引处,交换位置
                //此时的arr[i]是假定的最小值，将它赋值给j位置
                arr[i] = min;//再把最小值arr[j]=min 赋值给arr[i]位置
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
