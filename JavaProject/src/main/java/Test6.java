import java.util.*;
class Circle{
     double radius;
     double area;
     public void getArea(){
     area=3.14*radius*radius;
     }
}
class Yuanzhui extends Circle{
     double height;
     public double getVolume(){
     double volume=area*height/3;
     System.out.println("Բ׶��������:"+volume);
     return volume;
    }
}
public class Test6{
     public static void main(String args[]){
          Yuanzhui yuanzhui=new Yuanzhui();
          Scanner sc=new Scanner(System.in);
          System.out.println("������Բ�İ뾶:");
          yuanzhui.radius=sc.nextDouble();
          System.out.println("�������:");
          yuanzhui.height=sc.nextDouble();
          yuanzhui.getArea();
          yuanzhui.getVolume();
          }
}
          

     