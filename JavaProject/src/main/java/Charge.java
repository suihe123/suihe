import java.util.Scanner;
   public class Charge{
       public static void main(String args[]){
           Scanner sc=new Scanner(System.in);
           System.out.println("�����복������:");
           int  carType=sc.nextInt();
           if(carType!=1){
                System.out.println("л�����ڡ�");
           }
           else{
                System.out.println("�����ڡ�");
                System.out.println("������˳�����:");
                int number=sc.nextInt();
           if(number<=4){
                System.out.println("�շ���Ԫ");
           }
           else{
                System.out.println("�շѰ�Ԫ");
           }
     }
  }
}