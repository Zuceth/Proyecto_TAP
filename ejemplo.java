import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.JFrame;

public class ejemplo{

   public void construyeVentana(){
      //Creamos la ventana y asigamos al layout
      JFrame frame = new JFrame();
      frame.setLayout(new FlowLayout());

      //Creamos los componentes a utilizar
      JButton  botonEnviar = new JButton("Enviar");
      JTextField cajaTexto = new JTextField(12);
      JLabel  etiqueta = new JLabel("Escribe tu nombre");

      //Añadimos los componente a la ventana
      frame.add(etiqueta);
      frame.add(cajaTexto);
      frame.add(botonEnviar);

      //Configuraciones de la ventana
      frame.pack();
      frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }//fin construyeVentana
   public ejemplo(){  //constructor de la clase
      construyeVentana();
   }//fin constructor ejemplo

   public static void main(String [] arg){
     new ejemplo();
   }
  

}
