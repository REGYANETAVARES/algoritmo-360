/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package horoscopo;

import javax.swing.JOptionPane;  // Importando JOptionPane

/**
 *
 * @author REGYANE
 */
public class Signo {
    
String[] signos = new String[12];  // Armazena os nomes dos signos
    int[] ultDia = new int[12];  // Armazena o último dia de cada mês

    // Método para definir os signos e os últimos dias
    public void definirSignos() {
        for (int i = 0; i < 12; i++) {
            signos[i] = JOptionPane.showInputDialog("Digite o signo para o mês " + (i + 1));
            ultDia[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o último dia do mês para o signo " + signos[i]));
        }
    }

    // Método para calcular o signo com base na data
    public String calcularSigno(int data) {
        int dia = data / 100;  // Extrai o dia
        int mes = data % 100 - 1;  // Extrai o mês (ajuste para o índice começar em 0)
        
        if (dia > ultDia[mes]) {
            mes = (mes + 1) % 12;  // Se o dia for maior que o último dia, passa para o próximo signo
        }
        
        return signos[mes];  // Retorna o signo correspondente
    }
}
