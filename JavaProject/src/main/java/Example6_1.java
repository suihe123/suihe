import javax.swing.*;          //引用类
import java.awt.*;
import java.awt.event.*;
class Passwd extends JFrame implements ActionListener{     //处理事件
  JLabel lb1=new JLabel("请输入密码：");
  JPasswordField pf1=new JPasswordField(25);
  JLabel lb2=new JLabel("请再次输入密码：");
  JPasswordField pf2=new JPasswordField(25);
  JButton bn=new JButton("确定");
  JTextField tf=new JTextField(25);
  Passwd(){
    setSize(300,200);
    setVisible(true);
    setTitle("密码验证");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    add(lb1);
    add(pf1);
    pf1.setEchoChar('*');
    add(lb2);
    add(pf2);
    pf2.setEchoChar('*');
    add(bn);
    add(tf);
    validate();
    bn.addActionListener(this);
    }
  public void actionPerformed(ActionEvent e){
    String str1=new String(pf1.getPassword());
    String str2=new String(pf2.getPassword());
    if(str1.equals("abc")&&str1.equals(str2))
      tf.setText("密码正确！");
    else
      tf.setText("密码错误！");
    }
  }
public class Example6_1{
  public static void main(String args[]){
    new Passwd();
  }
}