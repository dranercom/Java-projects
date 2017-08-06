import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Test11{
  public static void main(String[] args) {
    Frame f = new Frame();
    Button btn = new Button("click");
    TextField txt = new TextField();
    txt.setBounds(10,150,100,30);
    btn.setBounds(10,100,100,30);
    f.add(btn);
    f.add(txt);
    btn.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        txt.setText("button clicked");
      }
    });n
    f.setSize(300,300);
    f.setLayout(null);
    f.setVisible(true);
  }
}
