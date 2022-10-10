/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Fornecedor;
import model.Produto;

/**
 *
 * @author Geral
 */
public class ProdutoDAO {
    private Connection con;

    public ProdutoDAO(Connection con) {
        this.con = ModuleConexao.conectar();
    }

    public ProdutoDAO() {
    }
    
    //Metodo cadastrarProdutos
    public void cadastrarProduto(Produto produto) {
        con = ModuleConexao.conectar();
        try {

            //1 passo  - criar o comando sql
            String sql = "insert into produtos (descricao, preco, qtd_estoque, fornecedor_id)  values (?,?,?,?)";

            //2 passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, produto.getDescricao());
            stmt.setDouble(2, produto.getPreco());
            stmt.setInt(3, produto.getQtd_estoque());
            
            stmt.setInt(4, produto.getFornecedor().getId());

            //3 passo - executar o comando sql
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Produto cadastrado com Sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);

        }

    }
    
     //Metodo AlterarProduto
    public void alterarProduto(Produto produto) {
        con = ModuleConexao.conectar();
        try {

            //1 passo  - criar o comando sql
            String sql = "update produtos set descricao=?, preco=?, qtd_estoque=?, fornecedor_id=? where id=?";

            //2 passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, produto.getDescricao());
            stmt.setDouble(2, produto.getPreco());
            stmt.setInt(3, produto.getQtd_estoque());
            stmt.setInt(4, produto.getFornecedor().getId());

            stmt.setInt(5, produto.getId());

            //3 passo - executar o comando sql
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Produto alterado com Sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);

        }
    }
    
    //Metodo ExcluirProduto
    public void excluirProduto(Produto produto) {
        con = ModuleConexao.conectar();
        try {

            //1 passo  - criar o comando sql
            String sql = "delete from produtos where id = ?";

            //2 passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, produto.getId());

            //3 passo - executar o comando sql
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Produto excluido com Sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);

        }

    }
    
    //Metodo Listar Todos Produto
    public List<Produto> listarProdutos() {
        con = ModuleConexao.conectar();
        try {

            //1 passo criar a lista
            List<Produto> lista = new ArrayList<>();

            //2 passo - criar o sql , organizar e executar.
            String sql = "select p.id, p.descricao, p.preco, p.qtd_estoque, f.nome from produtos as p inner join fornecedores as f on (p.fornecedor_id = f.id)";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Produto obj = new Produto();
                Fornecedor f = new Fornecedor();

                obj.setId(rs.getInt("p.id"));
                obj.setDescricao(rs.getString("p.descricao"));
                obj.setPreco(rs.getDouble("p.preco"));
                obj.setQtd_estoque(rs.getInt("p.qtd_estoque"));
                f.setNome(rs.getString(("f.nome")));
                
                obj.setFornecedor(f);

                lista.add(obj);
            }

            return lista;

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Erro :" + erro);
            return null;
        }

    }
    
   //metodo listarProduto por Nome(Descricao) - retorna uma lista
    public List <Produto> listarProdutoPorNome(String nome){
        con = ModuleConexao.conectar();
        try {
            
            //1° passo criar a lista
            List<Produto> lista = new ArrayList<>();
            
            //1 passo - criar o sql , organizar e executar.
            String sql = "select p.id, p.descricao. p.preco, p.qtd_estoque, f.nome from produtos as p inner join fornecedores as f on (p.fornecedor_id = f.id) where p.descricao like ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);

            ResultSet rs = stmt.executeQuery();
            Produto obj = new Produto();
            Fornecedor f = new Fornecedor();

            if (rs.next()) {

                obj.setId(rs.getInt("p.id"));
                obj.setDescricao(rs.getString("p.descricao"));
                obj.setPreco(rs.getDouble("p.preco"));
                obj.setQtd_estoque(rs.getInt("p.qtd_estoque"));
                f.setNome(rs.getString(("f.nome")));
                
                obj.setFornecedor(f);
                
                lista.add(obj);
            }

            return lista;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Produto não encontrado!");
            return null;
        }
    } 
    
  //metodo buscar Produto por Fornecedor
    public Produto buscarporFornecedor(String fornecedor) {
        con = ModuleConexao.conectar();
        try {
            //1 passo - criar o sql , organizar e executar.
            String sql = "select p.id, p.descricao. p.preco, p.qtd_estoque, f.nome from produtos as p inner join fornecedores as f on (p.fornecedor_id = f.id) where f.nome like ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, fornecedor);

            ResultSet rs = stmt.executeQuery();
            Produto obj = new Produto();
            Fornecedor f = new Fornecedor();

            if (rs.next()) {

                obj.setId(rs.getInt("id"));
                obj.setDescricao(rs.getString("descricao"));
                obj.setPreco(rs.getDouble("preco"));
                obj.setQtd_estoque(rs.getInt("qtd_estoque"));
                f.setNome(rs.getString(("f.nome")));
                
                obj.setFornecedor(f);
            }

            return obj;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Produto não encontrado!");
            return null;
        }
    }
    
    //metodo buscar Produto por Nome
    public Produto buscarProdutoporNome(String nome) {
        con = ModuleConexao.conectar();
        try {
            //1 passo - criar o sql , organizar e executar.
            String sql = "select p.id, p.descricao. p.preco, p.qtd_estoque, f.nome from produtos as p inner join fornecedores as f on (p.fornecedor_id = f.id) where p.descricao like ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);

            ResultSet rs = stmt.executeQuery();
            Produto obj = new Produto();
            Fornecedor f = new Fornecedor();

            if (rs.next()) {

                obj.setId(rs.getInt("id"));
                obj.setDescricao(rs.getString("descricao"));
                obj.setPreco(rs.getDouble("preco"));
                obj.setQtd_estoque(rs.getInt("qtd_estoque"));
                f.setNome(rs.getString(("f.nome")));
                
                obj.setFornecedor(f);
            }

            return obj;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Produto não encontrado!");
            return null;
        }
    } 
}
