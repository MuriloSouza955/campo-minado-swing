package br.com.MKCM.cm.modelo;

@FunctionalInterface
public interface CampoObservador {

    void eventoOcorreu(Campo campo, CampoEvento evento);
}
