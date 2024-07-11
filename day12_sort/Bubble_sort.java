package day12_sort;

/**
 * Bubble_sort
 */
public class Bubble_sort {

    public static void Bubblesort(int arr[]){
        for(int trun=0;trun<arr.length-1;trun++){
            for(int j=0;j<arr.length-1-trun;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]=temp;

                }
            }

        }
    }

    public static void Printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] ={5,4,1,3,2};
        Bubblesort(arr);
        Printarr(arr);

        
    }
}
