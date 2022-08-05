
//create a gui calci
import java.awt.event.*;
import java.awt.*;


public class calculator implements ActionListener
{
    Frame f;
    Panel p1,p2;
    TextField t1;
    int first=0, second=0, res=0;
    String op = "";
    calculator()
    {
        f = new Frame("Calci");
        f.setVisible(true);
        f.setSize(400,400);
        f.setBackground(Color.DARK_GRAY);
        f.setLayout(new GridLayout(2,1));
        p1 = new Panel();
        p2 = new Panel();
        t1 = new TextField(30);
        p1.add(t1);
        Button b1 = new Button("1");
        Button b2 = new Button("2");
        Button b3 = new Button("3");
        Button b4 = new Button("4");
        Button b5 = new Button("5");
        Button b6 = new Button("6");
        Button b7 = new Button("7");
        Button b8 = new Button("8");
        Button b9 = new Button("9");
        Button b10 = new Button("0");
        Button b11 = new Button("+");
        Button b12 = new Button("-");
        Button b13 = new Button("*");
        Button b14 = new Button("/");
        Button b15 = new Button("%");
        Button b16 = new Button("=");
        Button b17 = new Button("C");
        p2.setLayout(new GridLayout(5,4));
        p2.setBackground(Color.GRAY);
        p2.add(b17);
        p2.add(b15);
        p2.add(b14);
        p2.add(b13);
        p2.add(b7);
        p2.add(b9);
        p2.add(b12);
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        p2.add(b11);
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b8);
        p2.add(b10);
        f.add(p1);
        f.add(p2);
        p1.setBackground(Color.orange);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                System.exit(0);
            }
        });


    }
    public void actionPerformed(ActionEvent e){
        String s = e.getActionCommand();
        if (s.equals("0") || s.equals("1") || s == "2"|| s == "3"|| s == "4"|| s == "5"|| s == "6"|| s == "7"|| s == "8"|| s =="9")
        {
            t1.setText(t1.getText()+s);
        }
        if (s == "+"||s == "-"|| s == "*"|| s == "/"|| s == "%"){
            first = Integer.parseInt(t1.getText());
            op = s;
            t1.setText("");

        }
        if (s == "="){
            second = Integer.parseInt(t1.getText());

        }
        switch (op){
            case "+" : res = first+second;break;
            case "-" : res = first-second;break;
            case "*" : res = first*second;break;
            case "/" : res = first/second;break;
            case "%" : res = first%second;break;

        }
        t1.setText("");
        t1.setText(""+res);
        System.out.println(first);
        System.out.println(second);
        System.out.println(res);
    }

    public static void main(String[] args) {
        new calculator();
    }


}
