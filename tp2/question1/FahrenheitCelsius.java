package question1;



import java.util.Scanner;
/**
 * D�crivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom)
 * @version (un num�ro de version ou une date)
 */
public class FahrenheitCelsius {

    /**
     * le point d'entr�e de cette application, dont le commentaire est �
     * compl�ter
     * 
     * @param args
     *            ...
     */
    public static void main(String[] args) {
        // pour tous les param�tres de la ligne de commande
        //Scanner in = new Scanner(System.in);
        //String s = in.nextLine();
        for(int i = 0; i < args.length; i++){
        int fahrenheit = Integer.parseInt(args[i]) ;
        float celsius = fahrenheitEnCelsius(fahrenheit) ;
        System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C"); // ligne,
    }                                                         // format
                                                                        // impos�s
                                                                                
  }

    /**
     * la m�thode � compl�ter.
     * 
     * @param f
     *            la valeur en degr� Fahrenheit
     * @return la conversion en degr� Celsius
     */
    public static float fahrenheitEnCelsius(int f) {
        int fahrenheit = f;
        float celsius = (float) 5/9*(fahrenheit - 32);
        float Dec = celsius * 10;
        int Integers = (int)Dec;
        celsius = (float)Integers/10;
        return celsius ; // � compl�ter en rempla�ant ce return 0.F par la fonction
                    // de conversion
       
    }

}
