package curso_java;

import javax.swing.*;

public class lesson7 {
    public static void main(String[] args){

        var titulo_filme = JOptionPane.showInputDialog("Informe o título do filme");
        var horas = Double.parseDouble((JOptionPane.showInputDialog("Informe quantas horas dura o filme")));
        var min = Double.parseDouble((JOptionPane.showInputDialog("Informe quantos minutos dura o filme")));
        var n_duracao = (horas * 60) + min;
        JOptionPane.showMessageDialog(null, "A duração do filme " + titulo_filme + " em minutos é de "+n_duracao);

    }
}
