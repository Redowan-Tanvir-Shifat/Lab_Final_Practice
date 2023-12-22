import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;


public class SystemSorting implements ActionListener {
    JFrame jFrame = new JFrame();
    JLabel label_h = new JLabel();
    JLabel label_w = new JLabel();
    JLabel label_r = new JLabel();
    JTextField textField_h = new JTextField();
    JTextField textField_w = new JTextField();
    JTextField textField_r = new JTextField();
    JButton button_sq = new JButton("Add Square");
    JButton button_rect = new JButton("Add Rectangle");
    JButton button_circle = new JButton("Add Circle");
    JButton button_asc = new JButton();
    JButton button_dsc = new JButton();
    JTextArea area = new JTextArea();


    public SystemSorting() {
        jFrame.setBounds(600, 100, 580, 620);
        jFrame.setVisible(true);
        jFrame.setLayout(null);
       // jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        label_h.setBounds(40, 60, 40, 30);
        label_h.setText("Height");
        jFrame.add(label_h);
        textField_h.setBounds(85, 50, 100, 50);
        jFrame.add(textField_h);

        label_w.setBounds(200, 60, 40, 30);
        label_w.setText("Width");
        jFrame.add(label_w);
        textField_w.setBounds(245, 50, 100, 50);
        jFrame.add(textField_w);

        label_r.setBounds(360, 60, 40, 30);
        label_r.setText("Radius");
        jFrame.add(label_r);
        textField_r.setBounds(405, 50, 100, 50);
        jFrame.add(textField_r);

        button_sq.setBounds(30, 150, 150, 50);
        jFrame.add(button_sq);
        button_rect.setBounds(210, 150, 150, 50);
        jFrame.add(button_rect);
        button_circle.setBounds(395, 150, 150, 50);
        jFrame.add(button_circle);

        button_asc.setBounds(100, 250, 150, 50);
        button_asc.setText("Ascending");
        jFrame.add(button_asc);
        button_dsc.setBounds(350, 250, 150, 50);
        button_dsc.setText("Descending");
        jFrame.add(button_dsc);

        area.setBounds(40, 350, 490, 200);
        jFrame.add(area);

        button_sq.addActionListener(this);
        button_rect.addActionListener(this);
        button_circle.addActionListener(this);
        button_asc.addActionListener(this);
        button_dsc.addActionListener(this);
    }
    ArrayList<Shape> al = new ArrayList<>();

    public void actionPerformed(ActionEvent e) {
        String str = "";
        String obName = "";
        String resArea = "";
        String resPer = "";

        if (e.getSource() == button_sq) {
            double h = Double.parseDouble(textField_h.getText());
            Square s = new Square(h);
            al.add(s);
            area.setText("Added Square");
        }
        if (e.getSource() == button_rect) {
            double h = Double.parseDouble(textField_h.getText());
            double w = Double.parseDouble(textField_w.getText());
            Rectangle r = new Rectangle(h, w);
            al.add(r);
            area.setText("Added Rectangle");
        }
        if (e.getSource() == button_circle) {
            double r = Double.parseDouble(textField_r.getText());
            Circle c = new Circle(r);
            al.add(c);
            area.setText("Added Circle");
        }
        if (e.getSource() == button_asc) {
            Shape.state = 0;
            Collections.sort(al);
            resArea = String.valueOf(al.get(0).calculateArea());
            resPer = String.valueOf(al.get(0).calculatePerimeter());

            if (al.get(0) instanceof Square) {
                obName = "Square";
            } else if (al.get(0) instanceof  Rectangle) {
                obName = "Rectangle";
            }else if (al.get(0) instanceof Circle) {
                obName = "Circle";
            }
            area.setText("Name of Object: " + obName + "\nThe Area: " + resArea + "\nThe Perimeter: " + resPer );
        }
        if (e.getSource() == button_dsc) {
            Shape.state = 1;
            Collections.sort(al);
            resArea = String.valueOf(al.get(0).calculateArea());
            resPer = String.valueOf(al.get(0).calculatePerimeter());

            if (al.get(0) instanceof Square) {
                obName = "Square";
            } else if (al.get(0) instanceof  Rectangle) {
                obName = "Rectangle";
            }else if (al.get(0) instanceof Circle) {
                obName = "Circle";
            }
            area.setText("Name of Object: " + obName + "\nThe Area: " + resArea + "\nThe Perimeter: " + resPer );
        }

    }


    public static void main(String[] args) {
        new SystemSorting();
    }

}
