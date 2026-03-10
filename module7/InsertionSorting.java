package assignments.module7;

public class InsertionSorting {
    static void insertion(int arr[]){
        for(int i=1;i<arr.length;i++)
        {
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        for(int x:arr){
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        int[] arr={21,21,51,63,31,6,2};
        insertion(arr);
    }
}
