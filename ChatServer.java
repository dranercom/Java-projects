//client program for the chat app
import java.awt.*;
import java.awt.event.*;
import java.io.InputStreamReader;
import javax.swing.*;
import java.io.*;
import java.net.*;

class ChatServer{
static int y=580;
static JLabel label=null;
public static void main(String args[]) throws Exception{
  String defaultMessage = "Enter your message..";
  final int portno=3030;
  JFrame frame = new JFrame("FireFly");
  JTextField text = new JTextField(defaultMessage);
  //manipulate the default message in the text field
  text.addFocusListener(new FocusListener(){
    public void focusGained(FocusEvent ae){
      if(text.getText().equals(defaultMessage)){
          text.setText("");
      }
    }
    public void focusLost(FocusEvent ae){
      if(text.getText().isEmpty()){
        text.setText(defaultMessage);
      }
    }
  });
  text.setBounds(10,620,295,40);
  frame.add(text);
  JButton button = new JButton("SEND");
  button.setBounds(310,620,80,40);
  button.setForeground(Color.WHITE);
  button.setBackground(Color.decode("#11A458"));
  button.setFocusPainted(false);
  button.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent ae){
      if(!text.getText().equals(defaultMessage))
      {
        if(!text.getText().isEmpty()){
          try{
            ServerSocket ss = new ServerSocket(portno);
            Socket socket = ss.accept();
            BufferedReader bin1 = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream());
            String send,receive;
            while(true){
              if((receive = bin1.readLine())!=null){
                label = new JLabel(receive);
                label.setBounds(10,y,380,20);
                y = y-20;
                label.setHorizontalAlignment(SwingConstants.RIGHT);
                frame.add(label);
                frame.revalidate();
                frame.repaint();
              }
              send = text.getText();
              label = new JLabel(send);
              text.setText(defaultMessage);
              label.setBounds(10,y,380,20);
              y = y-20;
              frame.add(label);
              frame.revalidate();
              frame.repaint();
              out.println(send);
              out.flush();
            }
          }catch(UnknownHostException e){
            e.printStackTrace();
          }catch(IOException e){
            e.printStackTrace();
          }
          label=new JLabel(text.getText());
          text.setText(defaultMessage);
          label.setBounds(10,y,380,20);
          y=y-40;
          frame.add(label);
          frame.revalidate();
          frame.repaint();
        }
      }
    }
  });
  frame.add(button);
  frame.setSize(400,700);
  frame.setLayout(null);
  frame.setVisible(true);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
