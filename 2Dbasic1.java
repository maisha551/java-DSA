import java.util.*;
public class mul {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[3][4];
        System.out.println("Enter the elements");
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        // print 
        System.out.println("print the array");
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
// summation 
import java.util.*;
public class mul{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[][] arr1=new int[3][3]; // dimension has to be same
        int[][] arr2=new int[3][3];
        int[][] sum=new int[3][3];
        // take input for first array 
        System.out.println("1st array elements");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        // take input for the second array 
        System.out.println("second array elements");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        // sum 
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                sum[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
System.out.println(Arrays.deepToString(sum));
    }
}

*/ 
// maximum element 
/*import java.util.*;
public class mul{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int [3][3];
        // take inputs 
        for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            arr[i][j]=sc.nextInt();

        }
    }
    int max=arr[0][0];
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            if(arr[i][j]>max){
                max=arr[i][j];
            }
        }
    }
    System.out.println("max:"+" "+ max);


    // sum of each row 
    // initialize the sum inside 
    // row fixed // jetar sum ber korbo oita fixed 
    for(int i=0;i<3;i++){
        int sum=0;
        for(int j=0;j<3;j++){
            sum+=arr[i][j];
        }
    }
    // multiply 
    int mul=1;
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            mul*=arr[i][j];
        }
    }
    // even 
    int count=0;
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            if(arr[i][j]%2==0){
                count++;
            }
        }
    }
    System.out.println(count);

    // search 
    int element=3;
    boolean found=false;
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            if(arr[i][j]==3){
            found=true;
            }
            
        }
    }
