import java.util.Scanner;
class Consume{
       double expend;
       double remain;
       double newremain;
       void compute(){
        Scanner sc=new Scanner(System.in);
          System.out.println("请输入消费金额");
          expend=sc.nextInt();
          System.out.println("请输入卡内余额");
           remain=sc.nextInt();
          if(expend<=remain){
             newremain=remain-expend;
              }
          else{
             System.out.println("余额不足，请尽快充值!");
              }
             System.out.println("余额剩余:"+newremain);
      }
}
public class Test2{
     public static void main(String args[]){
            Consume consume=new Consume();
            consume.compute();
     }
}
     