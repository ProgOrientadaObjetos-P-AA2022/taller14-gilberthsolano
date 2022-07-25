/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author gilbertsolanosotomayor
 */
public class Enlace {

    private Connection conn;

    public void establecerConexion() {

        try {
            // db parameters  
            String url = "jdbc:sqlite:bd/basetrabajadores.bd";
            // create a connection to the database  
            conn = DriverManager.getConnection(url);
            // System.out.println(conn.isClosed());
            // System.out.println("Connection to SQLite has been established.");  

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public Connection obtenerConexion() {
        return conn;
    }

    public void insertarSueldoTrabajadores(SueldoTrabajadores st) {

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO trabajadores (cedula, nombre, "
                    + "correo, sueldo, mesSueldo) "
                    + "values ('%s', '%s', '%s', '%.2f', %d)",
                    st.obtenerCedula(),
                    st.obtenerNombre(),
                    st.obtenerCorreo(),
                    st.obtenerSueldo(),
                    st.obtenerMesSueldo()
            );
            System.out.println(data);
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarTrabajador");
            System.out.println(e.getMessage());

        }
    }

    public ArrayList<SueldoTrabajadores> obtenerDataTrabajadores() {
        ArrayList<SueldoTrabajadores> lista = new ArrayList<>();
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from trabajadores;";

            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {

                SueldoTrabajadores st = new SueldoTrabajadores(rs.getString("cedula"),
                        rs.getString("nombre"), rs.getString("correo"),
                        rs.getDouble("sueldo"),
                        rs.getInt("mesSueldo"));

                lista.add(st);
            }

            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: Error");
            System.out.println(e.getMessage());

        }
        return lista;
    }
}
