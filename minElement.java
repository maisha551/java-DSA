public class minElement {
    public static void main(String[] args){
        int[] arr={5,6,3,7};
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("min element:"+ " "+ min);

    }
}
