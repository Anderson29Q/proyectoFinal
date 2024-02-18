/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author USUARIO
 */
public class conexion {

    //zona de atributos
    private String jdbcURL;//Cadena de conexion
    private String jdbcUSERName;
    private String jdbcPassword;
    private Connection jdbcConnection;//Objeto para manejar el driver de SGBD
    //constructor para los datos iniciales de los atributos

    public conexion(String jdbcURL, String jdbcUSERName, String jdbcPassword) {
        this.jdbcURL = jdbcURL;
        this.jdbcUSERName = jdbcUSERName;
        this.jdbcPassword = jdbcPassword;
    }

    //metodo para abrir la conexion
    public Connection connection() throws SQLException {
        if (jdbcConnection == null || jdbcConnection.isClosed()) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                System.out.println("Conexion realizada");
            } catch (ClassNotFoundException er) {
                System.out.println("Error de conexion: " + er);
                throw new SQLException(er);
            }
            jdbcConnection = (Connection) DriverManager.getConnection(jdbcURL, jdbcUSERName, jdbcPassword);
        }
        return jdbcConnection;

    }

    //metodo que cierra la conexion bd
    public void disconnect() throws SQLException {
        if (jdbcConnection != null && jdbcConnection.isClosed()) {
            jdbcConnection.close();//cierra conexion a la base            
        }
    }

    //metodo para conocer los datos de la conexión
    public Connection getjdbcConnection() {
        return jdbcConnection;
    }

}
