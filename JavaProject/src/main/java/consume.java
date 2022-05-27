import java.util.Scanner;
public class consume{
     public static void main(String args[]){
          int expend,remain,newremain=0;
          Scanner sc=new Scanner(System.in);
          System.out.println("ÇëÊäÈëÏû·Ñ½ğ¶î");
          expend=sc.nextInt();
          System.out.println("ÇëÊäÈë¿¨ÄÚÓà¶î");
          remain=sc.nextInt();
          if(expend<=remain){
             newremain=remain-expend;
             }
          else{
             System.out.println("Óà¶î²»×ã£¬Çë¾¡¿ì³äÖµ!");
          }
       System.out.println("Óà¶îÊ£Óà:"+newremain);
      }
}