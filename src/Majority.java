
import java.util.*;
public class Majority {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int count =0;
        int arr[]= new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int maj =arr[0];
        for(int i=0;i<n;i++) {
            if (arr[i] == maj){
                count ++;
            }
            else if(count ==0){
                count =1;
                maj=arr[i];
            }
            else {
                count --;
            }
        }
        System.out.println(" Majority number is : "+maj);
    }
}