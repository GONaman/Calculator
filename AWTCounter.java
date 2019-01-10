import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.applet.Applet;

public class AWTCounter extends Frame
{
    private Button b0;
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;
    private Button b7;
    private Button b8;
    private Button b9;
    private Button b10;
    private Button b11;
    private Button b12;
    private Button b13;
    private Button b14;
    private Button b15;
    private Label lbl1;
    private Label lbl2;
    private Label lbl3;
    private TextField t1;
    private TextArea ta;
    private Panel p1;
    private Panel p2;
    private int ans=0;
    private int b=0;
    private int flag=0;
    private String s="";
    private char c;
    public AWTCounter()
    {
        Counter c=new Counter();

        setLayout(new GridLayout(2,1));
        setSize(300,300);
        setVisible(true);
        addWindowListener(c);

        p2=new Panel(new GridLayout(2,1));
        add(p2);

        ta=new TextArea("");
        ta.setEditable(false);
        p2.add(ta);

        t1=new TextField(ans+"");
        t1.setEditable(true);
        add(t1);
        p2.add(t1);

        p1=new Panel(new GridLayout(4,4));
        add(p1);

        b1=new Button("1");
        p1.add(b1);
        b1.addActionListener(c);


        b2=new Button("2");
        p1.add(b2);
        b2.addActionListener(c);

        b3=new Button("3");
        p1.add(b3);
        b3.addActionListener(c);

        b4=new Button("=");
        p1.add(b4);
        b4.addActionListener(c);

        b5=new Button("4");
        p1.add(b5);
        b5.addActionListener(c);

        b6=new Button("5");
        p1.add(b6);
        b6.addActionListener(c);

        b7=new Button("6");
        p1.add(b7);
        b7.addActionListener(c);

        b8=new Button("+");
        p1.add(b8);
        b8.addActionListener(c);

        b9=new Button("7");
        p1.add(b9);
        b9.addActionListener(c);

        b10=new Button("8");
        p1.add(b10);
        b10.addActionListener(c);

        b11=new Button("9");
        p1.add(b11);
        b11.addActionListener(c);

        b12=new Button("-");
        p1.add(b12);
        b12.addActionListener(c);

        b13=new Button("CLR");
        p1.add(b13);
        b13.addActionListener(c);

        b0=new Button("0");
        p1.add(b0);
        b0.addActionListener(c);

        b14=new Button("X");
        p1.add(b14);
        b14.addActionListener(c);

        b15=new Button("/");
        p1.add(b15);
        b15.addActionListener(c);

    }
    public static void main(String[] args)
    {
        AWTCounter c=new AWTCounter();
    }
    private class Counter implements ActionListener,WindowListener
    {
        public void actionPerformed(ActionEvent e)
        {
            Button B=(Button)e.getSource();
            if(B==b0)
            {
                b=10*b+0;
                t1.setText(b+"");
                s=s+"0";
                ta.setText(s);
            }
            else if(B==b1)
            {
                b=10*b+1;
                t1.setText(b+"");
                s=s+"1";
                ta.setText(s);
            }
            else if(B==b2)
            {
                b=10*b+2;
                t1.setText(b+"");
                s=s+"2";
                ta.setText(s);
            }
            else if(B==b3)
            {
                b=10*b+3;
                t1.setText(b+"");
                s=s+"3";
                ta.setText(s);
            }
            else if(B==b4)
            {
                this.handle();
                s="("+s+")";
                ta.setText(s);
                t1.setText(ans+"");
                b=0;
                c='\0';
            }
            else if(B==b5)
            {
                b=10*b+4;
                t1.setText(b+"");
                s=s+"4";
                ta.setText(s);
            }
            else if(B==b6)
            {
                b=10*b+5;
                t1.setText(b+"");
                s=s+"5";
                ta.setText(s);
            }
            else if(B==b7)
            {
                b=10*b+6;
                t1.setText(b+"");
                s=s+"6";
                ta.setText(s);
            }
            else if(B==b8)
            {
                this.handle();
                s="("+s+")"+" + ";
                ta.setText(s);
                t1.setText(ans+"");
                c='+';
                b=0;
            }
            else if(B==b9)
            {
                b=10*b+7;
                t1.setText(b+"");
                s=s+"7";
                ta.setText(s);
            }
            else if(B==b10)
            {
                b=10*b+8;
                t1.setText(b+"");
                s=s+"8";
                ta.setText(s);
            }
            else if(B==b11)
            {
                b=10*b+9;
                t1.setText(b+"");
                s=s+"9";
                ta.setText(s);
            }
            else if(B==b12)
            {
                this.handle();
                s="("+s+")"+" - ";
                ta.setText(s);
                t1.setText(ans+"");
                c='-';
                b=0;
            }
            else if(B==b13)
            {
                ta.setText("CLR\n");
                s="";
                b=0;
                ans=0;
                flag=0;
                t1.setText(ans+"");
            }
            else if(B==b14)
            {
                this.handle();
                s="("+s+")"+" X ";
                ta.setText(s);
                t1.setText(ans+"");
                c='*';
                b=0;
            }
            else if(B==b15)
            {
                this.handle();
                s="("+s+")"+" / ";
                ta.setText(s);
                t1.setText(ans+"");
                c='/';
                b=0;
            }
        }
        private void handle()
        {
            if(flag==0)
            {
                ans+=b;
                flag=1;
                return;
            }
            else
            {
                if(c=='+')
                {
                    ans=ans+b;
                }
                else if(c=='-')
                {
                    ans=ans-b;
                }
                else if(c=='*')
                {
                    ans=ans*b;
                }
                else if(c=='/')
                {
                    try{
                    ans=ans/b;}
                    catch(ArithmeticException e)
                    {
                        ans=0;
                    }
                }
                else if(c=='\0')
                {
                }
            }

        }

        public void windowClosing(WindowEvent e)
        {
            System.exit(0);
        }
        public void windowClosed(WindowEvent e){}
        public void windowOpened(WindowEvent e){}
        public void windowIconified(WindowEvent e){}
        public void windowDeiconified(WindowEvent e){}
        public void windowActivated(WindowEvent e){}
        public void windowDeactivated(WindowEvent e){}
    }
}
