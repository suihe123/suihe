import java.util.Scanner;
public class consume{
     public static void main(String args[]){
          int expend,remain,newremain=0;
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