/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senacrs.Dao;

import br.com.senacrs.Dao.ConnectionFactory;
import br.com.senacrs.Dao.UsuarioDao;
import br.com.senacrs.model.Cliente;
import br.com.senacrs.model.Usuario;
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
public class ClienteDao {

    public boolean checkLogin(String login, String senha) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        boolean check = false;

        try {

            stmt = con.prepareStatement("SELECT * FROM tbcliente WHERE login = ? and senha = ?");

            stmt.setString(1, login);
            stmt.setString(2, senha);

            rs = stmt.executeQuery();

            if (rs.next()) {

                check = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return check;

    }

    public void create(Cliente u) {

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO tbcliente (nomecli,emailcli,senhacli,celularcli,telefonecli,numerocli,cepcli,datacli,ruacli,bairrocli)VALUES(?,?,?,?,?,?,?,?,?,?)");

            stmt.setString(1, u.getNome());
            stmt.setString(2, u.getEmail());
            stmt.setString(3, u.getSenha());
            stmt.setString(4, u.getCelular());
            stmt.setString(5, u.getTelefone());
            stmt.setString(6, u.getNumero());
            stmt.setString(7, u.getCep());
            stmt.setString(8, u.getData());
            stmt.setString(9, u.getRua());
            stmt.setString(10, u.getBairro());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public List<Cliente> read() {

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Cliente> clientes = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM tbcliente");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt("pkidCli"));
                cliente.setNome(rs.getString("nomecli"));
                cliente.setEmail(rs.getString("emailcli"));
                cliente.setSenha(rs.getString("senhacli"));
                cliente.setCelular(rs.getString("celularcli"));
                cliente.setTelefone(rs.getString("telefonecli"));
                cliente.setNumero(rs.getString("numerocli"));
                cliente.setCep(rs.getString("cepcli"));
                cliente.setData(rs.getString("datacli"));
                cliente.setRua(rs.getString("ruacli"));
                cliente.setBairro(rs.getString("bairrocli"));

                clientes.add(cliente);

            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return clientes;

    }

    public List<Cliente> readForDesc(String desc) {

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Cliente> cliente = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM tbcliente WHERE nomeCli LIKE ?");
            stmt.setString(1, "%" + desc + "%");

            rs = stmt.executeQuery();

            while (rs.next()) {

                Cliente clientes = new Cliente();

                clientes.setId(rs.getInt("idCli"));
                clientes.setData(rs.getString("dataCli"));
                clientes.setNome(rs.getString("nomeCli"));
                clientes.setEmail(rs.getString("emailCli"));
                clientes.setSenha(rs.getString("senhaCli"));
                clientes.setCelular(rs.getString("celularCli"));
                clientes.setNumero(rs.getString("numeroCli"));
                clientes.setCep(rs.getString("cepCli"));
                clientes.setRua(rs.getString("ruaCli"));
                clientes.setBairro(rs.getString("bairroCli"));
                clientes.setTelefone(rs.getString("TelefoneCli"));

                cliente.add(clientes);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return cliente;
    }

    public void update(Cliente u) {

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE tbcliente SET   nomecli = ?, emailcli = ?, senhacli = ?, Celularcli = ?,telefonecli = ?, numerocli = ?, cepcli = ?,datacli = ? , ruacli = ?, bairrocli = ? WHERE pkidcli = ?");
            
            
            stmt.setString(1, u.getNome());
            stmt.setString(2, u.getEmail());
            stmt.setString(3, u.getSenha());
            stmt.setString(4, u.getCelular());
            stmt.setString(5, u.getTelefone());
            stmt.setString(6, u.getNumero());
            stmt.setString(7, u.getCep());
            stmt.setString(8, u.getData());
            stmt.setString(9, u.getRua());
            stmt.setString(10, u.getBairro());
            stmt.setInt(11, u.getId());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public void delete(Cliente u) {

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM tbcliente WHERE pkidcli = ?");
            stmt.setInt(1, u.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

}
