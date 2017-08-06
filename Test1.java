import java.net.*;
class Test1
{
public static void main(String args[]) throws UnknownHostException {
InetAddress Address = InetAddress.getLocalHost();
System.out.println(Address);
Address = InetAddress.getByName("www.google.com");
System.out.println(Address);
InetAddress w[] = InetAddress.getAllByName("www.google.com");
for(int i=0; i< w.length;i++){
  System.out.println(w[i]);
}
}
}
