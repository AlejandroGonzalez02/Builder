package com.company;

import javax.swing.*;

public class Pizza {
    //
    private String masa;//normal, integral, fina, masa pan...
    private boolean relleno;
    private int tipo;//familiar(1), mediana(2), pequeña(3)
    private boolean salsa;
    private String tipoSalsa;
    private boolean cebolla;
    private boolean sinGluten;
    private boolean extraQueso;
    private boolean piña;
    private boolean champiñones;
    private boolean jamon;

    //Constructores
    public Pizza(){
    }

    /**
     * objetos pizza
     * @param masa puede ser fina, normal o pan
     * @param relleno puede llevar(true) o no (false)
     * @param tipo puede ser pequeña, mediana o familiar
     * @param salsa puede llevar (true ) o no(no)
     * @param tipoSalsa puede ser
     * @param cebolla puede llevar (true) o no(false(no)
     * @param sinGluten puede llevar(true) o no(false)
     * @param extraQueso puede llevar(true) o no(false)
     * @param piña puede llevar (true) o no(flase)
     * @param champiñones puede llevar (true) o no(flase)
     * @param jamon puede llevar (true) o no(flase)
     */
    public Pizza(String masa, boolean relleno, int tipo, boolean salsa, String tipoSalsa, boolean cebolla, boolean sinGluten, boolean extraQueso, boolean piña, boolean champiñones, boolean jamon) {
        this.masa = masa;
        this.relleno = relleno;
        this.tipo = tipo;
        this.salsa = salsa;
        this.tipoSalsa = tipoSalsa;
        this.cebolla = cebolla;
        this.sinGluten = sinGluten;
        this.extraQueso = extraQueso;
        this.piña = piña;
        this.champiñones = champiñones;
        this.jamon = jamon;
    }

    //Getters and setters
    public String getMasa() { return masa;}
    public void setMasa(String masa) { this.masa = masa;}

    public boolean isRelleno() {return relleno;}
    public void setRelleno(boolean relleno) {this.relleno = relleno; }

    public int getTipo() {return tipo;}
    public void setTipo(int tipo) { this.tipo = tipo;}

    public boolean isSalsa() { return salsa; }
    public void setSalsa(boolean salsa) { this.salsa = salsa; }

    public String getTipoSalsa() { return tipoSalsa; }
    public void setTipoSalsa(String tipoSalsa) { this.tipoSalsa = tipoSalsa;}

    public boolean isCebolla() { return cebolla;}
    public void setCebolla(boolean cebolla) { this.cebolla = cebolla;}

    public boolean isSinGluten() { return sinGluten; }

    public void setSinGluten(boolean sinGluten) {this.sinGluten = sinGluten;}

    public boolean isExtraQueso() {return extraQueso;}

    public void setExtraQueso(boolean extraQueso) { this.extraQueso = extraQueso; }

    public boolean isPiña() { return piña; }
    public void setPiña(boolean piña) { this.piña = piña;}

    public boolean isChampiñones() { return champiñones;}
    public void setChampiñones(boolean champiñones) { this.champiñones = champiñones; }

    public boolean isJamon() { return jamon;}
    public void setJamon(boolean jamon) { this.jamon = jamon;}


    @Override
    public String toString() {
        return "PIZZA:" +
                "\n masa='" + masa + '\'' +
                "\n relleno=" + relleno +
                "\n tipo=" + tipo +
                "\n salsa=" + salsa +
                "\n tipoSalsa='" + tipoSalsa + '\'' +
                "\n cebolla=" + cebolla +
                "\n sinGluten=" + sinGluten +
                "\n extraQueso=" + extraQueso +
                "\n piña=" + piña +
                "\n champiñones=" + champiñones +
                "\n jamon=" + jamon;
    }
}
