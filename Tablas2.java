/*
Tablas de multiplicar usando el Scanner
 */
package tablas2;

import java.util.Scanner;

public class Tablas2 {
    
    // Autor: Francisco Castillo


    public static void main(String[] args) {
        Tablas2 t = new Tablas2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int n = sc.nextInt();
        t.metodo1(n);
        
    }
    
    public void metodo1(int n)
    {
        int result;
        for(int i = 1; i<=10; i++)
        {
            result = i * n;
            System.out.println(i+"x"+n+"="+result+"\n");
        }
    }
}
