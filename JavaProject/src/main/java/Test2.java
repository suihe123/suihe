import java.util.Scanner;
class Consume{
       double expend;
       double remain;
       double newremain;
       void compute(){
        Scanner sc=new Scanner(System.in);
          System.out.println("���������ѽ��");
          expend=sc.nextInt();
          System.out.println("�����뿨�����");
           remain=sc.nextInt();
          if(expend<=remain){
             newremain=remain-expend;
              }
          else{
             System.out.println("���㣬�뾡���ֵ!");
              }
             System.out.println("���ʣ��:"+newremain);
      }
}
public class Test2{
     public static void main(String args[]){
            Consume consume=new Consume();
            consume.compute();
     }
}
     