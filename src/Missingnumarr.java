public class Missingnumarr {

        public static void main(String[] args) {
            int arr[] ={1,2,3,4,5,6,8,9,10};
            int actualsum =0;
            int expectedsum =((arr.length+1)*(arr.length+2)/2);
            for(int num : arr){
                actualsum+= num;
            }
            int result = expectedsum-actualsum;
            System.out.println("Missing number is "+result);
        }



}
