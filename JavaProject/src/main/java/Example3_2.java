public class Example3_2{
    public static void main(String args[]){
         int a=9,b=5,c=7,t=0;
         if(b<a){
         t=a;
         a=b;
         b=t;
         }
         if(c<a){
         t=c;
         a=c;
         a=t;
         }
         if(c<b){
         t=b;
         c=b;
         c=t;
         }
         System.out.println("a="+a+",b="+b+",c="+c);
     }
}