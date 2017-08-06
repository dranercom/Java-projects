import java.awt.*;
import java.applet.*;
/*<applet code="Test13.class" width=300 height=300>
</applet>*/
public class Test13 extends Applet implements Runnable{
  Thread t;
  String msg="welcome";
  int i=0;
  public void start(){
    t= new Thread(this);
    t.start();
  }
  public void run(){
    for(;;){
      try{
        i++;
        repaint();
        t.sleep(250);
    }catch(Exception e){
      e.printStackTrace();
    }
  }
  }
  public void paint(Graphics g){
    g.drawString(msg,50+3*i,50);
  }
}
