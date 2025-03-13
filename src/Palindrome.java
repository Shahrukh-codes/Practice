public class Palindrome {


    public static void main(String[] args) {
        String str = "madam";
        String newstr ="";
        for(int i=str.length()-1;i>=0;i--){
            newstr = newstr+str.charAt(i);
        }
        if(str.equals(newstr)){
            System.out.println(str +"  is Palendrome : ");
        }
        else {
            System.out.println(str + " is not Palindrome : ");
        }

    }
}