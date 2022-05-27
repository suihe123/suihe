import java.util.*;
class Teacher{
       private String name;
       private int age;                 
       public void introduction(String name,int age){
                 this.name=name;
                 this.age=age;
                 if(age<22){
                            System.out.println("错误!该教员的年龄不符合要求!");
                 }
                 else{
                 System.out.println("教员的名字是"+name+"教员的年龄是"+age);  
        }
     }
  }
public class Test5{
     public static void main(String args[]){
                Teacher teacher=new Teacher();
                Scanner sc=new Scanner(System.in);
                System.out.println("请输入教员名称:");
                String name=sc.nextLine();
                System.out.println("请输入教员年龄:");
                int age=sc.nextInt();
                teacher.introduction(name,age);
        }
   }