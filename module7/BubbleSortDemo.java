package assignments.module7;

public class BubbleSortDemo {
    public static void bubblesort(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            for(int j=1;j<n-1;j++){
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int x:arr){
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        int[] arr={2,42,5,2,52};
        bubblesort(arr);
    }

}
