package org.formacion.factorymethod;

public class CargaFrontalFabricante implements Fabricante{

    public Lavadora crearLavadora(){
        return new LavadoraCargaFrontal();
    }
}
