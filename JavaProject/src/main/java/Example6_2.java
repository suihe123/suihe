class Threadsale implements Runnable{ 
  int tickets=120;
  public synchronized int saleTickets(){
  if(tickets>0){
       System.out.println(Thread.currentThread().getName()+"售机票第"+tickets--+"号");
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
      Thread t1=new Thread(t,"第1售票窗口"); 
      Thread t2=new Thread(t,"第2售票窗口") ;
      Thread t3=new Thread(t,"第3售票窗口"); 
      Thread t4=new Thread(t,"第4售票窗口");
      t1.start(); 
      t2.start();
      t3.start(); 
      t4.start();
    }
}