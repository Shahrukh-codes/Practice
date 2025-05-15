import java.util.*;
public class Repeating {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        int maj;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        maj = arr[0];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

    }
}
