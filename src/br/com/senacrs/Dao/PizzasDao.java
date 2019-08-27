/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senacrs.Dao;

import br.com.senacrs.model.Pizzas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 181810025
 */
public class PizzasDao {
     public boolean checkLogin(String login, String senha) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        boolean check = false;

        try {

            stmt = con.prepareStatement("SELECT * FROM tbpizzas WHERE loginusu = ? and senhausu = ?");
            stmt.setString(1, login);
            stmt.setString(2, senha);

            rs = stmt.executeQuery();

            if (rs.next()) {

                check = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(PizzasDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return check;

    }

    public void create(Pizzas u) {

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO tbpizzas (nomepiz,ingredientespiz,valor,tamanhopiz)VALUES(?,?,?,?)");
            stmt.setString(1, u.getNomepiz());
            stmt.setString(2, u.getIngredientepiz());
            stmt.setDouble(3, u.getValorpiz());  
            stmt.setString(4, u.getTamanhopiz());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public List<Pizzas> read() {

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Pizzas> pizzas = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM tbpizzas");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Pizzas pizza = new Pizzas();

                pizza.setIdpiz(rs.getInt("idpiz"));
                pizza.setNomepiz(rs.getString("nomepiz"));
                pizza.setIngredientepiz(rs.getString("ingredientespiz"));
                pizza.setValorpiz(rs.getDouble("valor"));
                pizza.setTamanhopiz(rs.getString("tamanhopiz")); 
                pizzas.add(pizza);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PizzasDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return pizzas;

    }

    public List<Pizzas> readForDesc(String desc) {

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Pizzas> produtos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM tbpizzas WHERE nomepiz LIKE ?");
            stmt.setString(1, "%" + desc + "%");

            rs = stmt.executeQuery();

            while (rs.next()) {

                Pizzas pizzas = new Pizzas();

                pizzas.setIdpiz(rs.getInt("pkidpiz"));
                pizzas.setNomepiz(rs.getString("nomepiz"));
                pizzas.setIngredientepiz(rs.getString("ingredientespiz"));
                pizzas.setValorpiz(rs.getDouble("valor"));
                pizzas.setTamanhopiz(rs.getString("tamanhopiz"));
                
                produtos.add(pizzas);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return produtos;
    }

    public void update(Pizzas u) {

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE tbpizzas SET  nomepiz = ? ,ingredientespiz = ?,valor = ?, tamanhopiz = ? WHERE idpiz = ?");
            stmt.setString(1, u.getNomepiz());
            stmt.setString(2, u.getIngredientepiz());
          
            stmt.setDouble(3,u.getValorpiz());  
            stmt.setString(4, u.getTamanhopiz());
            stmt.setInt(5, u.getIdpiz());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Pedido alterado com sucesso  !");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no pedido com sucesso: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public void delete(Pizzas u) {

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM tbpizzas WHERE idpiz = ?");
            stmt.setInt(1, u.getIdpiz());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido o Pedido!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

}


