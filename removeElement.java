

import java.util.Arrays;

public class ewmovwElement{
    public static void main(String[] args){
        int[] arr={3,4,5,6};
        int element=4;
        int idx=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element){
                arr[i]=0;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                idx=i;
                break;
            }
        }
        for(int i=idx;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=0;
        System.out.println(Arrays.toString(arr));

    }
