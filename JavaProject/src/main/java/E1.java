public class E1{
    public static void main(String args[]){
         double sum=0,item=1;
         int i=1,n=10;
         for( i =1;i<=n;i++){
              sum=sum+item;
              i=i+1;
              item=item*(1.0/i);
        }
       System.out.println("sum="+sum);
    }
}