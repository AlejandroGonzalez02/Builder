package com.company;

public class BuilderPizza {
    Pizza _pizza;

    public BuilderPizza() {

    }

    //metodo que devolve o obxeto rematado
    public Pizza build(){
        return this._pizza;
    }

    public BuilderPizza setMasa(String tipoMasa){
        _pizza.setMasa(tipoMasa);
        return this;
    }
}
