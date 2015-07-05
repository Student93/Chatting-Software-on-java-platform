import java.io.*;
import java.net.*;
import javax.swing.*;
import java.awt.event.*;
public class Myclient implements ActionListener
{
   String s1="";
   Socket s;
   DataInputStream din;
   DataOutputStream dout;
   JFrame jf,jf1;
   JTextArea ja;
   JTextField jt,jt1;
   JButton jb,jb1;
   JLabel jl,jl1;
Myclient()
{

jf=new JFrame("Login by Suraj");
jt=new JTextField();
jt1=new JTextField();
jt1.setBounds(150,70,150,30);
jf.add(jt1);
jl1=new JLabel("IP-Address(Server):");
jl1.setBounds(5,55,150,50);
jf.add(jl1);
jb=new JButton("Login");
jb.setBounds(120,125,100,50);
jf.add(jb);
jl=new JLabel("Enter UserName:");
jl.setBounds(5,10,150,50);
jf.add(jl);
jb.addActionListener(this);
jt.setBounds(150,25,150,30);
jf.add(jt);
jf.setSize(320,210);
jf.setLayout(null);
jf.setVisible(true);



}


public void actionPerformed(ActionEvent e)
{

if(e.getSource()==jb)
{
try
{
jf.setVisible(false);
 s1=jt.getText();
String s2=jt1.getText();
if(s2.equals(""))
s2="localhost";
s=new Socket(s2,1200);
din=new DataInputStream(s.getInputStream());
dout=new DataOutputStream(s.getOutputStream());
dout.writeUTF(s1);

dout.flush();
jf1=new JFrame(s1+" chat");
jt=new JTextField();
jt1=new JTextField();
jt1.setBounds(175,420,100,25);
jf1.add(jt1);

jb1=new JButton("send");
jb1.setBounds(50,420,100,25);
jb1.addActionListener(this);
jf1.add(jb1);
jt.setBounds(5,10,400,25);
jf1.add(jt);
ja=new JTextArea();
ja.setEditable(false);
ja.setBounds(5,40,400,350);
jf1.add(ja);
My m=new My(din,ja);
Thread t1=new Thread(m);
t1.start();
jf1.setSize(425,500);
jf1.setLayout(null);
jf1.setVisible(true);
}
catch(Exception e1)
{System.out.println(e1);}

}


if(e.getSource()==jb1)
{//System.out.println("sss");
try
{
String s4=jt.getText();
String s5=jt1.getText();
System.out.println(s4+s5+"dd");
dout.writeUTF(s1+":"+s4);
dout.flush();
dout.writeUTF(s5);
dout.flush();
jt.setText("");
jt1.setText("");
}catch(Exception e2){System.out.println(e2);}



}



}


public static void main(String... s3)
{


new Myclient();

}




}
