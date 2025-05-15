class Calculation {
   public int add(int a,int b){
int r = a+b;
return r;
    }
}

public class Calcu{
    public static void main(String args[]){
        int num1=4;
        int num2=5;
        Calculation cal = new Calculation();
        int result = cal.add(num1, num2);
        System.out.println(result);
    }
}
