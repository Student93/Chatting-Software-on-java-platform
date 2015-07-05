import java.io.*;
import java.net.*;
import java.util.*;
public class Myserver
{

ArrayList al=new ArrayList();
ArrayList al1=new ArrayList();
DataInputStream din;
ServerSocket ss;
Socket s;

Myserver()
{
try
{
ss=new ServerSocket(1200);
while(true)
{



s=ss.accept();
din=new DataInputStream(s.getInputStream());
String s1=din.readUTF();
al.add(s);
al1.add(s1);
Runnable r=new Mythread(s,al,al1,din);
Thread t=new Thread(r);
t.start();



}

}catch(Exception e)
{System.out.println(e);}




}


public static void main(String... a)
{




new Myserver();

}

}
