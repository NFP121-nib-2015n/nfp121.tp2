package question3;

import question1.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IHMFahrenheit extends JFrame implements ActionListener{
  private JTextField entree = new JTextField( 6 );
  /** Le bouton de conversion. */
  private JButton  boutonDeConversion = new JButton( "convertir" );
  /** La sortie en degr� Celsius. */
  private JTextField sortie = new JTextField( 6 );

  public IHMFahrenheit(){
    super("IHM Fahrenheit");
 
    setLayout(new FlowLayout());
    add( entree ); add( boutonDeConversion ); add( sortie );
    sortie.setEditable( false );
    getContentPane().setBackground( Color.pink );
    setLocation(100,100);
    pack();setVisible(true);
    
    boutonDeConversion.addActionListener( this );
  }

  /** 
   * m�thode d�clench�e lorsque le bouton de conversion est appuy�. 
   * remarquer que le champs de droite (les degr�s Celsius) n'est pas �ditable.
   * @param ae l'�v�nement transmis
   */
  public void actionPerformed( ActionEvent ae ){
    try{
        String Input = entree.getText();
        String a = Input;
        String b = Input;
        double Tester = Double.parseDouble(a) ;
        if (Tester >= 273.1 || Tester <= -273.1){
            sortie.setText("error !");
        }
        else{
        int fahrenheit = Integer.parseInt(b) ;
        float celsius = fahrenheitEnCelsius(fahrenheit) ;
      sortie.setText( Float.toString( celsius));}
    }catch(NumberFormatException nfe){
      sortie.setText("error ! ");
    }
  }
  public static float fahrenheitEnCelsius( int f){
        int fahrenheit = f;
        float celsius = (float) 5/9*(fahrenheit - 32);
        float Dec = celsius * 10;
        int Integers = (int)Dec;
        celsius = (float)Integers/10;
        return celsius ;
     }
  
  public static void main(String[] args){
      new IHMFahrenheit();
    }
}
