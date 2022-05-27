public class Example4_2{
     public static void main(String args[]){
         long sum=0,a=9,count=a,n=6,i=1;        
         for(i=1;i<=n;i++){
             sum=sum+count;
             count=count*10+a;
          }
     System.out.println(sum);
   }
}