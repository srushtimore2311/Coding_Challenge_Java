package day11_array;
import java.util.*;
public class Binary_search {
    public static int BinarySearch(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            // find mid
            int mid=(start+end)/2;
            // .compare
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]>key){
                end=mid-1;
            }else{
                start=mid+1;
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12,14};
        int key=10;
        System.err.println(BinarySearch(arr, key));
    }
}
