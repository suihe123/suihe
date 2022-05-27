import java.util.Scanner;
   public class Charge{
       public static void main(String args[]){
           Scanner sc=new Scanner(System.in);
           System.out.println("请输入车辆类型:");
           int  carType=sc.nextInt();
           if(carType!=1){
                System.out.println("谢绝入内。");
           }
           else{
                System.out.println("请入内。");
                System.out.println("请输入乘车人数:");
                int number=sc.nextInt();
           if(number<=4){
                System.out.println("收费五元");
           }
           else{
                System.out.println("收费八元");
           }
     }
  }
}