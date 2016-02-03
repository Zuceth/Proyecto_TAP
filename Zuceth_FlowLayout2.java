import java.awt.FlowLayout;
import javax.swing.*;

public class Zuceth_FlowLayout2{

    public static void main(String []arg){
        JFrame ventana = new JFrame();
        ventana.setLayout(new FlowLayout(FlowLayout.LEFT));

        JButton btn1 = new JButton("A");
        JButton btn2 = new JButton("B");
        JButton btn3 = new JButton("C");
        JButton btn4 = new JButton("D");
        JButton btn5 = new JButton("F");

        ventana.add(btn1);
        ventana.add(btn2);
        ventana.add(btn3);
        ventana.add(btn4);
        ventana.add(btn5);

        ventana.pack();
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.setVisible(true);


   }//Fin del main

}//Fin de la clase
