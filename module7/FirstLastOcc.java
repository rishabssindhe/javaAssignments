package assignments.module7;

public class FirstLastOcc {
    public static int FirstTime(int[] arr,int key){
        int s=0;
        int e=arr.length-1;
        int ans =-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==key){
                ans =mid;
                e=mid-1;
            }
            else if(arr[mid]<key){
                s=mid+1;
            } else if(arr[mid]>key){
                e=mid-1;
            }
        }
        return ans;
    }
    public static int LastTime(int[] arr,int key){
        int s=0;
        int e=arr.length-1;
        int ans =-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==key){
                ans =mid;
                s=mid+1;
            }
            else if(arr[mid]<key){
                s=mid+1;
            } else if(arr[mid]>key){
                e=mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={1,2,2,3,3,4,5,6};
        System.out.println("First Occurrence of 2 is :"+FirstTime(arr,2));
        System.out.println("Last Occurrence of 2 is :"+LastTime(arr,2));
    }
}
