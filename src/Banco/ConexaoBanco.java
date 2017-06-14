package Banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Felipe
 */
public class ConexaoBanco {
    
    public Statement stm; 
    public ResultSet rs;
    private String driver;
    private String caminho;
    private String usuario;
    private String senha;
    public Connection conn;

    public void conexao (){
        try {
            System.setProperty("jdbc.Drivers", driver);
            conn= DriverManager.getConnection(caminho, usuario, senha);
            JOptionPane.showMessageDialog(null,"Conectado com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao conectar"+ ex.getMessage());
        }
        
    }
    public void desconecta(){
        try {
            conn.close();
            JOptionPane.showMessageDialog(null,"Desconectado com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao fechar a conexão"+ ex.getMessage());
        }
        
    }
}
