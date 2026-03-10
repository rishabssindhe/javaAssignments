package assignments.module7;

public class SelectionSort1 {
    static void selection(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }
            if(minIndex!=i){
                int temp=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=temp;
            }
        }
        for(int x:arr){
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        int[] arr={3,1,6,2,9,4};
        selection(arr);
    }
}
