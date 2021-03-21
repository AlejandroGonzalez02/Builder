package com.company;

public class Main {

    public static void main(String[] args) {
        /*pizza1
        Pizza pizza1= new Pizza();
        pizza1.setMasa("normal");
        pizza1.setRelleno(true);
        pizza1.setTipo(1);
        pizza1.setSalsa(true);
        pizza1.setTipoSalsa("tomate");
        pizza1.setCebolla(true);
        pizza1.setSinGluten(false);
        pizza1.setExtraQueso(true);
        pizza1.setPiña(true);
        pizza1.setChampiñones(true);
        pizza1.setJamon(true);
        System.out.println(pizza1.toString());

        Pizza piazta = new Pizza("fina", true,Pizza.tipo);
        */
        BuilderPizza BaseBuilder= new BuilderPizza();
        BaseBuilder = BaseBuilder.setMasa("pan");
        Pizza base= new BuilderPizza().setMasa("pan").build();
        System.out.println("Las pizzas.");

    }

}
