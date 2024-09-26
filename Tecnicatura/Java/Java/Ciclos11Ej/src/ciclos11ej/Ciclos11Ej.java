/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclos11ej;

import javax.swing.JOptionPane;

/**
 *
 * @author nahue
 */
public class Ciclos11Ej {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int cont;
        int total;

        cont = 0;
        total = 1;
        for (int i = 0; i < 30; i++) {

            if ((i % 2 == 1)) {
                cont++;
                total = total * i;

                if (cont >= 10) {
                    break;
                }
            }

        }

          JOptionPane.showInputDialog("total de multiplicaciones impares "+total);

  JOptionPane.showInputDialog("suma "+cont);

    }

}
