/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.DAO;

import br.com.DTO.UsuarioDTO;
import br.com.VIEW.Principal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author W10
 */
public class UsuarioDAO {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public int criarELogar(UsuarioDTO dto) {

        String sql = "insert into tb_usuarios (nome, email, nome_usuario, senha)value(?,?,?,?) ";
        conexao = ConexaoDAO.connector();

        try {

            pst = conexao.prepareStatement(sql);

            pst.setString(1, dto.getNome());
            pst.setString(2, dto.getEmail());
            pst.setString(3, dto.getNome_usuario());
            pst.setString(4, dto.getSenha());

            int go = pst.executeUpdate();

            if (go > 0) {

                JOptionPane.showMessageDialog(null, "adicionado com sucesso, seja bem vindo! ");

                Principal pri = new Principal();
                pri.setVisible(true);
                return 1;

            } else {
                return 0;
            }

        } catch (Exception e) {

            if (e.getMessage().contains("tb_usuarios.nome_usuario_UNIQUE")) {

                JOptionPane.showMessageDialog(null, "nome de usuario ja em uso");
                return 0;

            } else if (e.getMessage().contains("tb_usuarios.email")) {

                JOptionPane.showMessageDialog(null, "email ja em uso");
                return 0;

            } else {

                JOptionPane.showMessageDialog(null, e.getMessage());
                return 0;
            }

        }
    }

    public int logar(UsuarioDTO dto) {
        String sql = "select * from tb_usuarios where nome_usuario = ? and senha = ?";

        conexao = ConexaoDAO.connector();

        try {

            pst = conexao.prepareStatement(sql);

            pst.setString(1, dto.getNome_usuario());
            pst.setString(2, dto.getSenha());

            rs = pst.executeQuery();

            if (rs.next()) {
                Principal pri = new Principal();
                pri.setVisible(true);
                return 1;
            } else {
                JOptionPane.showMessageDialog(null, "nome de usuario e/ ou senha invalidas");
                return 0;
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.getMessage());
            return 0;
        }

    }

    public void criar(UsuarioDTO dto) {
        String sql = "insert into tb_usuarios (id, nome, email, nome_usuario, senha) value(?,?,?,?, ?) ";
        conexao = ConexaoDAO.connector();

        try {
            pst = conexao.prepareStatement(sql);

            pst.setInt(1, dto.getId());
            pst.setString(2, dto.getNome());
            pst.setString(3, dto.getEmail());
            pst.setString(4, dto.getNome_usuario());
            pst.setString(5, dto.getSenha());

            int go = pst.executeUpdate();

            if (go > 0) {
                JOptionPane.showMessageDialog(null, "adicionado com sucesso");
            }

        } catch (Exception e) {

            if (e.getMessage().contains("tb_usuarios.nome_usuario_UNIQUE")) {

                JOptionPane.showMessageDialog(null, "nome de usuario ja em uso");

            } else if (e.getMessage().contains("tb_usuarios.email")) {

                JOptionPane.showMessageDialog(null, "email ja em uso");

            } else {

                JOptionPane.showMessageDialog(null, e.getMessage());

            }
        }
    }

}