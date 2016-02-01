import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FLowLayout4 {
   private JFrame mainFrame;
   private JLabel headerLabel;
   private JLabel statusLabel;
   private JPanel controlPanel;
   private JLabel msglabel;

   public FLowLayout4(){
      prepareGUI();
   }

   public static void main(String[] args){
      FLowLayout4 swingLayoutDemo = new FLowLayout4();  
      swingLayoutDemo.showFlowLayoutDemo();       
   }
      
   private void prepareGUI(){
      mainFrame = new JFrame("Ejemplo FLowLayout");
      mainFrame.setSize(400,400);
      mainFrame.setLayout(new GridLayout(3, 1));

      headerLabel = new JLabel("",JLabel.CENTER );
      statusLabel = new JLabel("",JLabel.CENTER);        

      statusLabel.setSize(350,100);
      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });    
      controlPanel = new JPanel();
      controlPanel.setLayout(new FlowLayout());

      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.setVisible(true);  
   }

   private void showFlowLayoutDemo(){
      headerLabel.setText("Layout en accion: FlowLayout");      

      JPanel panel = new JPanel();
      panel.setBackground(Color.darkGray);
      panel.setSize(200,200);
      FlowLayout layout = new FlowLayout();
      layout.setHgap(10);              
      layout.setVgap(10);
      panel.setLayout(layout);        
      panel.add(new JButton("Aceptar"));
      panel.add(new JButton("Cancelar"));       

      controlPanel.add(panel);

      mainFrame.setVisible(true);  
   }
}

