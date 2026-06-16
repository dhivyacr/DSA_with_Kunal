import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        reverse(arr);
        System.out.print(Arrays.toString(arr));
    }
    static int[] reverse(int[]arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            swap(arr,start,end);
             end--;
             start++;
        }
       return arr;
    }
    
    static void swap(int[]arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
