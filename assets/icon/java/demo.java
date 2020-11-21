import java.awt.event.*;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
class demo extends Frame
{
    demo()
    {
        setVisible(true);
        setSize(500,300);
        setLocation(100,200);
        setBackground(Color.pink);
        setForeground(Color.blue);
        addWindowListener(new WindowAdapter()
        {
              public void windowClosing(WindowEvent e)
              {
                  System.exit(0);
 
              }
        });
    
    }
    
    public void paint(Graphics g)
    {
      g.drawString("paras",700,500);
      g.drawLine(100,100,200,200);
      g.drawRect(500,500,500,500);
      /*Font f = new Font("Georgia",Font.ITALIC,20);
      setFont(f);*/
    
    }

    public static void main(String args[])
   {
     demo d=new demo();
         
   }
}