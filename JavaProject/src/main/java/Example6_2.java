class Threadsale implements Runnable{ 
  int tickets=120;
  public synchronized int saleTickets(){
  if(tickets>0){
       System.out.println(Thread.currentThread().getName()+"�ۻ�Ʊ��"+tickets--+"��");
  }
  return tickets;
  } 
  public void run(){
       while(tickets>0){ 
            saleTickets(); 
            try{
                Thread.sleep(10);
                }
            catch(InterruptedException e){
           }
       }
    }
}
public class Example6_2{
      public static void main(String arg[]){
      Threadsale t=new Threadsale();
      Thread t1=new Thread(t,"��1��Ʊ����"); 
      Thread t2=new Thread(t,"��2��Ʊ����") ;
      Thread t3=new Thread(t,"��3��Ʊ����"); 
      Thread t4=new Thread(t,"��4��Ʊ����");
      t1.start(); 
      t2.start();
      t3.start(); 
      t4.start();
    }
}