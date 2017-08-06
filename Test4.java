import java.applet.*;
import java.awt.*;
/*
<applet code="Test4.class" width=700 height=300>
</applet>
*/
public class Test4 extends Applet{
  //Button btn=new Button("click");
  String msg="";
  public void init(){
    msg="entered init()";
  }
  public void start(){
    msg+="entered start()";
  }
  public void paint(Graphics g){
    msg+="entered paint()";
    g.drawString(msg,150,150);
  }
  public void stop(){
    msg+="entered stop()";
  }
}
