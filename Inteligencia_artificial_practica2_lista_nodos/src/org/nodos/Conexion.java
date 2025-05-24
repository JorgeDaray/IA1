package org.nodos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conexion {

    Connection conn;

    public Connection Conexion() {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost/storage", "root", "");
// con.createStatement();
            this.conn = con;
        } catch (SQLException e) {
//e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error en la Conexion");
        }
        return this.conn;
    }
}
