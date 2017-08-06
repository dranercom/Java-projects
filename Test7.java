//chat client
import java.io.*;
import java.net.*;
class Test7{
  public static void main(String[] args){
    String hostname = "localhost";
    int portno=3030;
    try{
      Socket sock = new Socket(hostname,portno);
      InputStreamReader fin1 = new InputStreamReader(System.in);
      BufferedReader bin1 = new BufferedReader(fin1);
      PrintWriter ou = new PrintWriter(sock.getOutputStream());
      InputStreamReader fin2 = new InputStreamReader(sock.getInputStream());
      BufferedReader bin2 = new BufferedReader(fin2);
      String send,receive;
      while(true){
        System.out.print("Client : ");
        send = bin1.readLine();
        ou.println(send);
        ou.flush();
        if((receive = bin2.readLine())!=null){
          System.out.println("server : "+receive);
        }
      }
    }catch(UnknownHostException e){
      e.printStackTrace();
    }catch(IOException e){
      e.printStackTrace();
    }
  }
}
