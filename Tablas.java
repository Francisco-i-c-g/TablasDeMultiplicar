/*
Tablas de Multiplicar Usando el JOptionPane
 */
package tablas;

import javax.swing.JOptionPane;

public class Tablas {

// Autor : Francisco Castillo


    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero: "));
        Tablas t = new Tablas();
        t.metodo1(numero);
        
        
    }

    public void metodo1(int n) 
    {
        int result;
        String text = "";
        for(int i = 1; i<=10; i++)
        {
            result = i * n;
            text+=Integer.toString(i)+"x"+Integer.toString(n)+"="+Integer.toString(result)+"\n";
            
        }
        
        JOptionPane.showMessageDialog(null,"Tablas de multiplicar del "+n+"\n"+text);
        
    
    }
    
}
