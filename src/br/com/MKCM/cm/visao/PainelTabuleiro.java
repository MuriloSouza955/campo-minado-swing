package br.com.MKCM.cm.visao;

import br.com.MKCM.cm.modelo.Tabuleiro;

import javax.swing.*;
import java.awt.*;

public class PainelTabuleiro extends JPanel {

    public PainelTabuleiro(Tabuleiro tabuleiro){
        setLayout(new GridLayout(tabuleiro.getLinhas(), tabuleiro.getColunas()));

       tabuleiro.paraCadaCampo(c -> add(new BotaoCampo(c)));

       tabuleiro.registrarObservador(e -> {
           //TODO mostrar resultado paro usuario
       });
    }
}
