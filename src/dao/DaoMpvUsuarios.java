/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.MpvUsuarios;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import testes.JdbcCrud;

/**
 *
 * @author u08016696180
 */
public class DaoMpvUsuarios extends DaoAbstract {

    @Override
    public void insert(Object object) {
        MpvUsuarios mpvUsuarios = (MpvUsuarios) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_marcos_vilhanueva";
            user = "marcos_vilhanueva";
            password = "marcos_vilhanueva";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into mpv_usuarios values (?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.executeUpdate();
            pst.setInt(1, mpvUsuarios.getMpv_Usuarios());
            pst.setString(2, mpvUsuarios.getMpv_Nome()); //Kbn
            pst.setString(3, mpvUsuarios.getMpv_Apelido());
            pst.setString(4, mpvUsuarios.getMpv_Cpf());
            pst.setString(5, null); //data de nascimento
            pst.setInt(6, mpvUsuarios.getMpv_nivel());
            pst.setString(7, mpvUsuarios.getMpv_senha());
            pst.setString(8, mpvUsuarios.getMpv_ativo());

        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(JdbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JdbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delet(Object object) {

    }

    @Override
    public Object list(int id) {

        return null;
    }

    @Override
    public Object listALL() {
        return null;
    }

}
