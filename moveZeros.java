import java.util.*;
    class toTheEnd {
    public static void main(String[] args){
        int [] arr={3,4,5,0,9,5,0,7};
        for(int i=0;i<arr.length;i++){
        if(arr[i]==0){
        for(int j=i;j<arr.length-1;j++){
        arr[j]=arr[j+1];
        }
        
        arr[arr.length-1]=0;
        i--;
    }
    }
    System.out.println(Arrays.toString(arr));
    }
}
