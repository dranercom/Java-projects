import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="Test6.class" width=500 height=500>
</applet>
*/
public class Test6 extends Applet implements MouseListener{
  int x=0,y=0;
  String msg="";
  public void init(){
    addMouseListener(this);
  }
  public void paint(Graphics g){
    g.drawString(msg,x,y);
  }
  public void mouseClicked(MouseEvent e){
    x=e.getX();
    y=e.getY();
    msg="mouse clicked at"+"x="+x+"y="+y;
    repaint();
  }
  public void mouseExited(MouseEvent e){
    msg="mouseExited";
    repaint();
  }
  public void mouseEntered(MouseEvent e){
    msg="mouseEntered";
    repaint();
  }
  public void mouseReleased(MouseEvent e){
    msg="mouseReleased";
    repaint();
  }
  public void mousePressed(MouseEvent e){
    msg="mousePressed";
    repaint();
  }
}
