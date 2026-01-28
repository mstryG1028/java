package OOPS;
public class testing {

   public static class Fraction{
   
    int a;
    int b;
    public Fraction(int a,int b){
        this.a=a;
        this.b=b;
    }
     static int add(int a,int b){
       return a+b; 
    }
    static int subs(int a,int b){
        return a-b;
    }
    
   }

    public static void main(String args[]) {
System.out.println(Fraction.add(12,12));
       

    }

}
