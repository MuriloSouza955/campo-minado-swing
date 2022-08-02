package br.com.MKCM.cm.visao;

import br.com.MKCM.cm.modelo.Tabuleiro;

import javax.swing.*;
import java.awt.*;

import static javax.swing.SwingUtilities.*;

public class PainelTabuleiro extends JPanel {

    public PainelTabuleiro(Tabuleiro tabuleiro){
        setLayout(new GridLayout(tabuleiro.getLinhas(), tabuleiro.getColunas()));

       tabuleiro.paraCadaCampo(c -> add(new BotaoCampo(c)));

       tabuleiro.registrarObservador(e -> invokeLater(() -> {
           if (e.ganhou()) {
               JOptionPane.showMessageDialog(this, "Ganhou..:D");
           } else {
               JOptionPane.showMessageDialog(this, "Perdeu :'(");
           }

           tabuleiro.reiniciar();
       }));
    }
}
