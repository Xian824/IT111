import javax.swing.*;
import java.awt.*;

public class ShowWindow2  {
    public static void main(String[] args) {
        JFrame window = new JFrame("A Simple Window");
        JTextField textField = new JTextField(10);

        window.setSize(400,550);
        window.setLocation(150,250);
        window.getContentPane().setBackground(Color.RED);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

        JLabel myLabel1 = new JLabel("My First Big Label!!!");
        myLabel1.setBounds(20,30,200,50);
        myLabel1.setFont(new Font("Arial", Font.PLAIN,16));

        JLabel myLabel2 = new JLabel("My Second Big Label!");
        myLabel2.setBounds(20,30,200,200);
        myLabel2.setFont(new Font("Arial", Font.BOLD,17));

        JTextField TextField1 = new JTextField();
        TextField1.setBounds(20,70,230,35);
        JTextField TextField2 = new JTextField();
        TextField2.setBounds(20,150,230,35);

        window.getContentPane().add(myLabel1);
        window.getContentPane().add(myLabel2);
        window.getContentPane().add(TextField1);
        window.getContentPane().add(TextField2);

        window.setLayout(null);

        

    }


}
