
package com.mycompany.quiz2;

public class Lancha extends VehiculoBase {
    private TipoCombustible combustible;

    public Lancha(String marca, String modelo, TipoCombustible combustible) {
        super(marca, modelo);
        this.combustible = combustible;
    }

    @Override
    public TipoCombustible tipoCombustible() {
        return combustible;
    }
}

