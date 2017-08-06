//chat server
import java.io.*;
import java.net.*;
class Test8{
  public static void main(String[] args) {
    final int port = 3030;
    try{
      ServerSocket ss = new ServerSocket(port);
      Socket socket = ss.accept();
      InputStreamReader fin1 = new InputStreamReader(socket.getInputStream());
      BufferedReader bin1 = new BufferedReader(fin1);
      InputStreamReader fin2 = new InputStreamReader(System.in);
      BufferedReader bin2 = new BufferedReader(fin2);
      PrintWriter out = new PrintWriter(socket.getOutputStream());
      String send,receive;
      while(true){
        if((receive = bin1.readLine())!=null){
          System.out.println("client : "+receive);
        }
        System.out.print("server : ");
        send = bin2.readLine();
        out.println(send);
        out.flush();
      }
    }catch(IOException e){
      e.printStackTrace();
    }
  }
}
