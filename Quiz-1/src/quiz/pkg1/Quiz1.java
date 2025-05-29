/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author stell
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String lectura;
        float salario;
        lectura=JOptionPane.showInputDialog("Digite su salario: "); //Para que ingrese el salario ganado 
        salario=Integer.parseInt(lectura); // Para que convierta el string a un int 
        double SEM = salario*0.0925; // Operacion de Rebajo
        double IVM= salario*0.0508; //Operacion de rebajo 
        double totalRebajos =SEM+IVM; //Total que se debe rebajar del salario
        double salarioNeto= salario-totalRebajos; //Lo que queda del salario segun los rebajos
        double asociacion= salarioNeto*0.025; // Descuento de la asociacion al salario neto
        JOptionPane.showMessageDialog(null, "La empresa debera pagar el monto de "+totalRebajos+" por consepto de SEM y IVM");
        JOptionPane.showMessageDialog(null, "Para la asociacion de la empresa se le asigna un valor de "+asociacion);
         
    }
   
}
