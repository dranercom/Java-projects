//sample code to implement a button in applet
import java.applet.Applet;
import java.awt.event.*;
import java.awt.*;
/*
<applet code="Test5.class" width=500 height=500>
</applet>
*/
public class Test5 extends Applet implements ActionListener{
  Button btn = new Button("Click");
  Label l=new Label("click on this link");
  String msg="";
  public void init(){
    add(btn);
    add(l);
    l.setVisible(true);
    btn.setVisible(true);
    btn.addActionListener(this);
  }
  public void actionPerformed(ActionEvent e){
    if(e.getSource() == btn){
      msg="button is clicked";
      repaint();
    }
  }
  public void paint(Graphics g){
      g.drawString(msg,10,100);
  }
}
