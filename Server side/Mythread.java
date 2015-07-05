import java.io.*;
import java.net.*;
import java.util.*;
public class Mythread implements Runnable
{

Socket s;
ArrayList al,al1;
DataInputStream din;
DataOutputStream dout;

Mythread(Socket s,ArrayList al,ArrayList al1,DataInputStream din)
{

this.s=s;
this.al=al;
this.al1=al1;
this.din=din;


}

public void run()
{
String s1="",s2="";

while(true)
{
try
{
s1=din.readUTF();
System.out.println(s1);
s2=din.readUTF();
System.out.println("sss"+s2+"ddd");
if(s2.equals(""))
{

telleveryone(s1);

}
else
{

tell(s1,s2);
s2="";
}


}catch(Exception e)
{System.out.println(e);}
}




}




public void tell(String s1,String s2)
{
Iterator i=al.iterator();
Iterator i1=al1.iterator();
while(i1.hasNext())
{
try
{


String s3=(String)i1.next();
if(s2.equals(s3))
{

Socket sc=(Socket)i.next();
dout=new DataOutputStream(sc.getOutputStream());
dout.writeUTF(s1);
dout.flush();
}
else
i.next();

}catch(Exception e)
{System.out.println(e);}



}


}

public void telleveryone(String s1)
{
Iterator i=al.iterator();

while(i.hasNext())
{
try
{


Socket sc1=(Socket)i.next();

dout=new DataOutputStream(sc1.getOutputStream());
dout.writeUTF(s1);
dout.flush();
}
catch(Exception e)
{System.out.println(e);}



}





}
 


}




