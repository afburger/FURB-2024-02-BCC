package com.furb.poo.exemplos.aula10.model.interfacee;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class MensalidadeEstudo implements Pagavel {

    @Override
    public double calcularValorPagar() {
        return 1300.00;
    }

}