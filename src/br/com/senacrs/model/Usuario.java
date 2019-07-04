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
public class Usuario {
    private int idUsu;
    private String nomeUsu;
    private String loginUsu;
    private String senhaUsu;

    public Usuario() {
    }

    public Usuario(int idUsu, String nomeUsu, String loginUsu, String senhaUsu) {
        this.idUsu = idUsu;
        this.nomeUsu = nomeUsu;
        this.loginUsu = loginUsu;
        this.senhaUsu = senhaUsu;
    }

    public int getIdUsu() {
        return idUsu;
    }

    public void setIdUsu(int idUsu) {
        this.idUsu = idUsu;
    }

    public String getNomeUsu() {
        return nomeUsu;
    }

    public void setNomeUsu(String nomeUsu) {
        this.nomeUsu = nomeUsu;
    }

    public String getLoginUsu() {
        return loginUsu;
    }

    public void setLoginUsu(String loginUsu) {
        this.loginUsu = loginUsu;
    }

    public String getSenhaUsu() {
        return senhaUsu;
    }

    public void setSenhaUsu(String senhaUsu) {
        this.senhaUsu = senhaUsu;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsu=" + idUsu + ", nomeUsu=" + nomeUsu + ", loginUsu=" + loginUsu + ", senhaUsu=" + senhaUsu + '}';
    }
    
    
    
    
}
