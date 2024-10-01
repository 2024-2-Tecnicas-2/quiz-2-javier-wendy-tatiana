package com.mycompany.quiz2;

public class Principal {

    public static void main(String[] args) {

        Coche coche = new Coche("Toyota", "Corolla", TipoCombustible.GASOLINA);

        Lancha lancha = new Lancha("Yamaha", "Waverunner", TipoCombustible.ELECTRICO);

        System.out.println("Coche:");
        coche.acelerar();
        coche.frenar();
        System.out.println("Tipo de combustible del coche: " + coche.tipoCombustible());

        System.out.println("\nLancha:");
        lancha.acelerar();
        lancha.frenar();
        System.out.println("Tipo de combustible de la lancha: " + lancha.tipoCombustible());
    }

    public class Vehiculo {

        private TipoCombustible TipoCombustible;

        public void setTipoCombustible(TipoCombustible tipoCombustible) {
            this.TipoCombustible = tipoCombustible;
        }
    }

}
