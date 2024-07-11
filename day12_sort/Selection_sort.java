package day12_sort;

public class Selection_sort {
    public static void SelectionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int mincurr=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[mincurr]>arr[j]){
                    mincurr=j;
                }
            }
            int temp=arr[mincurr];
            arr[mincurr]=arr[i];
            arr[i]=temp;
        }

    }
    public static void PrintArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        SelectionSort(arr);
        PrintArr(arr);

    }    
}
