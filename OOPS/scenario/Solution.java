class Calculator{
   int sum(int a, int b){
    return a+b;
   }

   int sum(int a,int b, int c){
    return a+b+c;
   }
   double sum(double a,double b){
    return a+b;
   }
}
public class Solution {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.sum(5,10));
        System.out.println(c.sum(5,10,15));
        System.out.println(c.sum(5.1,2.4));
        
    }
}
