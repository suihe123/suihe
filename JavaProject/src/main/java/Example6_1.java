import javax.swing.*;          //������
import java.awt.*;
import java.awt.event.*;
class Passwd extends JFrame implements ActionListener{     //�����¼�
  JLabel lb1=new JLabel("���������룺");
  JPasswordField pf1=new JPasswordField(25);
  JLabel lb2=new JLabel("���ٴ��������룺");
  JPasswordField pf2=new JPasswordField(25);
  JButton bn=new JButton("ȷ��");
  JTextField tf=new JTextField(25);
  Passwd(){
    setSize(300,200);
    setVisible(true);
    setTitle("������֤");
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
      tf.setText("������ȷ��");
    else
      tf.setText("�������");
    }
  }
public class Example6_1{
  public static void main(String args[]){
    new Passwd();
  }
}