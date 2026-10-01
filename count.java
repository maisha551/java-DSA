public class count {
    public static void main(String[] args){
        int[] arr={2,3,4,5,6,7};
        System.out.println("count the event and odd number");
        int even=0;
        int odd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("total even numbers:"+ " "+even);
        System.out.println("total odd numbers:"+ " "+odd);

        System.out.println("count pos ,neg and zeros");
        int pos=0;
        int neg=0;
        int zero=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                pos++;
            }
            else if(arr[i]<0){
                neg++;
            }
            else{
                zero++;
            }
        }
        System.out.println("even numbers:"+ " "+even);
        System.out.println("odd numbers:"+" "+odd);
        System.out.println("zeros:"+ " "+zero);
        System.out.println("positive numbers:"+ " "+pos);
        System.out.println("negative numbers:"+ " "+neg);
    }
}
