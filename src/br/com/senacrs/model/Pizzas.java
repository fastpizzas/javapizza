/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senacrs.model;

/**
 *
 * @author 181810025
 */
public class Pizzas {

    private int idpiz;
    private String nomepiz;
    private String ingredientepiz;
    private double valorpiz;
    private String tamanhopiz;

    public Pizzas() {
    }

    public Pizzas(int idpiz, String nomepiz, String ingredientepiz, double valorpiz, String tamanhopiz) {
        this.idpiz = idpiz;
        this.nomepiz = nomepiz;
        this.ingredientepiz = ingredientepiz;
        this.valorpiz = valorpiz;
        this.tamanhopiz = tamanhopiz;
    }

    public int getIdpiz() {
        return idpiz;
    }

    public void setIdpiz(int idpiz) {
        this.idpiz = idpiz;
    }

    public String getNomepiz() {
        return nomepiz;
    }

    public void setNomepiz(String nomepiz) {
        this.nomepiz = nomepiz;
    }

    public String getIngredientepiz() {
        return ingredientepiz;
    }

    public void setIngredientepiz(String ingredientepiz) {
        this.ingredientepiz = ingredientepiz;
    }

    public double getValorpiz() {
        return valorpiz;
    }

    public void setValorpiz(double valorpiz) {
        this.valorpiz = valorpiz;
    }

    public String getTamanhopiz() {
        return tamanhopiz;
    }

    public void setTamanhopiz(String tamanhopiz) {
        this.tamanhopiz = tamanhopiz;
    }

}
