import java.util.*;
class Teacher{
       private String name;
       private int age;                 
       public void introduction(String name,int age){
                 this.name=name;
                 this.age=age;
                 if(age<22){
                            System.out.println("����!�ý�Ա�����䲻����Ҫ��!");
                 }
                 else{
                 System.out.println("��Ա��������"+name+"��Ա��������"+age);  
        }
     }
  }
public class Test5{
     public static void main(String args[]){
                Teacher teacher=new Teacher();
                Scanner sc=new Scanner(System.in);
                System.out.println("�������Ա����:");
                String name=sc.nextLine();
                System.out.println("�������Ա����:");
                int age=sc.nextInt();
                teacher.introduction(name,age);
        }
   }