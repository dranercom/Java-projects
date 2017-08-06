import java.io.*;
class Test2{
  public static void main(String[] args) throws IOException {
    FileOutputStream fout1=new FileOutputStream("/home/draner/Documents/input.txt");
    FileOutputStream fout2=new FileOutputStream("/home/draner/Documents/sam.txt");
    ByteArrayOutputStream baos=new ByteArrayOutputStream();
    String s="hey there";
    byte b[]=s.getBytes();
    baos.write(b);
    baos.writeTo(fout1);
    baos.writeTo(fout2);
    baos.flush();
    baos.close();
  }
}
