import java.sql.SQLOutput;

abstract  class A{
   abstract public void ab();
   public void bc(){
       System.out.println("Hrida");
   }
}
class B extends A{
    public void ab(){
        System.out.println("Saim");
    }
}


public class Abstrac {
    public static void main(String args[]){
B obj = new B();
obj.ab();
obj.bc();
    }
}
