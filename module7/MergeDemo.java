package assignments.module7;

import java.util.Arrays;

public class MergeDemo {
    public static void merge(int[] arr, int s, int mid, int e){
        int n1=mid-s+1;
        int n2=e-mid;
        int[] l=new int[n1];
        int[] n=new int[n2];
        for(int i=0;i<n1;i++){
            l[i]=arr[s+i];}
        for(int j=0;j<n2;j++){
            n[j]=arr[mid+1+j];
        }
        int i=0,j=0;
        int k=s;
        while(i<n1&&j<n2){
            if(l[i]<=n[j]){
                arr[k++]=l[i++];
            }
            else{
                arr[k++]=n[j++];
            }
        }
        while(i<n1){
            arr[k++]=l[i++];
        }
        while(j<n2){
            arr[k++]=n[j++];
        }
    }

    public static void mergeSort(int[] arr,int s,int e){
        if(s<e){
            int mid=s+(e-s)/2;
            mergeSort(arr,s,mid);
            mergeSort(arr,mid+1,e);
            merge(arr,s,mid,e);
        }
    }

    public static void main(String[] args) {
        int[] arr={2,1,5,7,3,7,2,5};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
