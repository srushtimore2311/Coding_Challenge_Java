package day11_array;

public class Sub_array {
    public static void SubArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]);
                }
                System.out.println();
            }

            System.out.println();
           ṭ
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8};
        SubArray(arr);
        
    }
}
