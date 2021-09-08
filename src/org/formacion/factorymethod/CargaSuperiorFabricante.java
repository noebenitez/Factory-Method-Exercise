package org.formacion.factorymethod;

public class CargaSuperiorFabricante implements Fabricante{

    public Lavadora crearLavadora(){
        return new LavadoraCargaSuperior();
    }
}
