import java.awt.*;
import java.awt.event.*;

    class RegForm extends Frame {
        // Constructor for RegForm
        RegForm() {
            setLayout(null);
            // GUI
            Label l1 = new Label("Registration Form");
            add(l1);
            l1.setBounds(300, 50, 200, 30);

            Label l2 = new Label("First name:");
            add(l2);
            l2.setBounds(50, 100, 100, 30);
            TextField t1 = new TextField(15);
            add(t1);
            t1.setBounds(150, 100, 200, 30);

            Label l3 = new Label("Last name:");
            add(l3);
            l3.setBounds(50, 140, 100, 30);
            TextField t2 = new TextField(15);
            add(t2);
            t2.setBounds(150, 140, 200, 30);

            Label l4 = new Label("Email:");
            add(l4);
            l4.setBounds(50, 180, 100, 30);
            TextField t3 = new TextField(50);
            add(t3);
            t3.setBounds(150, 180, 200, 30);

            Label l5 = new Label("Phone Number:");
            add(l5);
            l5.setBounds(50, 220, 100, 30);
            TextField t4 = new TextField();
            add(t4);
            t4.setBounds(150, 220, 200, 30);

            Label l6 = new Label("Address:");
            add(l6);
            l6.setBounds(50, 260, 100, 30);
            TextArea a = new TextArea(5, 30);
            add(a);
            a.setBounds(150, 260, 200, 100);

            Label l7 = new Label("Gender:");
            add(l7);
            l7.setBounds(50, 370, 100, 30);

            CheckboxGroup cbg = new CheckboxGroup();
            Checkbox c8 = new Checkbox("Male", cbg, false);
            add(c8);
            c8.setBounds(150, 370, 60, 30);
            Checkbox c9 = new Checkbox("Female", cbg, false);
            add(c9);
            c9.setBounds(220, 370, 70, 30);

            Label l9 = new Label("Preferred Location:");
            add(l9);
            l9.setBounds(50, 410, 120, 30);

            Checkbox c1 = new Checkbox("Mumbai");
            add(c1);
            c1.setBounds(170, 410, 80, 30);

            Checkbox c2 = new Checkbox("Pune");
            add(c2);
            c2.setBounds(250, 410, 80, 30);

            Checkbox c3 = new Checkbox("Bangalore");
            add(c3);
            c3.setBounds(330, 410, 80, 30);

            Checkbox c4 = new Checkbox("Guwahati");
            add(c4);
            c4.setBounds(410, 410, 80, 30);

            Checkbox c5 = new Checkbox("Goa");
            add(c5);
            c5.setBounds(490, 410, 80, 30);

            Checkbox c6 = new Checkbox("Shimla");
            add(c6);
            c6.setBounds(570, 410, 80, 30);

            Checkbox c7 = new Checkbox("Srinagar");
            add(c7);
            c7.setBounds(650, 410, 80, 30);

            Label l10 = new Label("Activities:");
            add(l10);
            l10.setBounds(50, 450, 100, 30);

            List l = new List(4);
            l.add("Rock Climbing");
            l.add("Bungee Jumping");
            l.add("Zip Lining - Flying Fox");
            l.add("River Rafting");
            l.add("Paragliding");
            l.add("Skiing");
            l.add("Hiking");
            l.add("Mountain Biking");
            add(l);
            l.setBounds(150, 450, 200, 100);

            Label l11 = new Label("Number of days:");
            add(l11);
            l11.setBounds(50, 560, 100, 30);

            Choice c = new Choice();
            c.add("3 days");
            c.add("4 days");
            c.add("5 days");
            c.add("6 days");
            c.add("One week");
            add(c);
            c.setBounds(150, 560, 100, 30);

            Button b1 = new Button("Submit");
            add(b1);
            b1.setBounds(150, 600, 100, 30);

            // Close Frame
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });

            // Frame Control
            setVisible(true);
            setSize(800, 800);
            setTitle("Registration Form");
            setResizable(false);
        }

        // main
        public static void main(String[] args) {
            // obj of RegForm
            RegForm r = new RegForm();
        }
    }
