public class firstOccure {
    public static void main(String[] args){
        int[] arr={4,5,6,7,6,7};
        int element=100;
        int firstOccur=0;
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element){
                firstOccur=i;
                found=true;
                break;
            }
        }
        if(found){
            System.out.println("first occur at:"+ " "+ " index"+ " "+firstOccur);
        }
        else{
            System.out.println("does not exist");
        }
       
    }
}
