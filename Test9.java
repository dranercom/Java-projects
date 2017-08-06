import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="Test9.class" width="300" height="300">
</applet>
*/
public class Test9 extends Applet implements ActionListener{
  String msg="";
  Button btn= new Button("Click");
  public void init(){
    add(btn);
    btn.setVisible(true);
    btn.addActionListener(this);
  }
  public void paint(Graphics g){
    g.drawString(msg,150,150);
  }
  public void actionPerformed(ActionEvent e){
    if(e.getSource() == btn){
      msg="button clicked";
      repaint();
    }
  }
}
