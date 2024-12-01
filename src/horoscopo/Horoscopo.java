/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package horoscopo;

import javax.swing.JOptionPane;

/**
 *
 * @author REGYANE
 */
public class Horoscopo {

   public static void main(String[] args) {
        // Instancia a classe Signo
        Signo signoData = new Signo();

        // Definir os signos e últimos dias
        signoData.definirSignos();

        // Interagir com o usuário para fornecer as datas de nascimento
        while (true) {
            int data = Integer.parseInt(JOptionPane.showInputDialog("Digite a data de nascimento no formato ddmm ou 9999 para terminar:"));

            // Se a data for 9999, termina o programa
            if (data == 9999) {
                break;
            }

            // Chama o método para calcular o signo e exibe o resultado
            String signo = signoData.calcularSigno(data);
            JOptionPane.showMessageDialog(null, "O signo é: " + signo);
        }

        // Exibe mensagem final
        JOptionPane.showMessageDialog(null, "Fim do programa.");
    }
}