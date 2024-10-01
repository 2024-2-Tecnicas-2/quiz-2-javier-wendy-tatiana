
package com.mycompany.quiz2;
    public class Coche extends VehiculoBase {
    private final TipoCombustible combustible;
 
    public Coche(String marca, String modelo, TipoCombustible combustible) {
        super(marca, modelo);
        this.combustible = combustible;
    }
 
    @Override
    public TipoCombustible tipoCombustible() {
        return combustible;
    }
}
