package assignments.module7;

public class BinarySearchDemo {
    static int binary(int[] arr,int key)
    {
        int s=0;
        int e=arr.length-1;
        while(s<e){
            int mid = s+ (e-s)/2;
            if(arr[mid]==key)
                return mid;
            else if(arr[mid]<key) s=mid+1;
            else e=mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={2,5,6,42,52};
        System.out.println(binary(arr,42));
    }
}
