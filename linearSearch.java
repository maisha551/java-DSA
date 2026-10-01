public class exist {
    public static void main(String[] args){
        int[] arr={3,4,5,6};
        boolean found=false;
        int element=4;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element){
                found=true;
            }
        }
        if(found){
            System.out.println("exists");
        }
        else{
            System.out.println("does not exists");
        }
    }
}
