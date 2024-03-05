package database;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String password = "852456";

        try {
            // Se carga el driver de PostgreSQL
            Class.forName("org.postgresql.Driver");

            // Se establece la conexion
            java.sql.Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conectado a base de datos");

            // Se cierra la conexion
            connection.close();
        } catch (ClassNotFoundException e) {
            System.err.println("Error: No se pudo encontrar la clase del controlador JDBC");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Error SQL: No se pudo establecer la conexion a la base de datos");
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Error: No se pudo establecer la conexion a la base de datos");
            e.printStackTrace();
        }
    }
}
