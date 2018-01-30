package sk.akademiasovy.tipos.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySQLdatabase {
    private final String url = "jdbc:mysql://localhost:3306/";
    private final String dbName = "tipos";
    private final String driver = "com.mysql.jdbc.Driver";
    private final String userName = "user2";
    private final String password = "secret";
    private Connection conn;

    public void testConnection() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        try {
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url + dbName, userName, password);
            if (conn == null)
                System.out.println("Connection failed.");
            else {
                System.out.println("Connection OK.");
            }
            conn.close();
        }
        catch (Exception e){
            System.out.println("Error, I cannot connect to the database");
        }
    }

    public boolean insertValuesIntoDrawHistory(int arr[]) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        try {
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url + dbName, userName, password);
            String cmd = "INSERT INTO draw_history(ball1, ball2, ball3, ball4, ball5)";
            cmd+=" VALUES(?,?,?,?,?)";
            PreparedStatement preparedStatement = conn.prepareStatement(cmd);
            preparedStatement.setInt(1,arr[0]);
            preparedStatement.setInt(2,arr[1]);
            preparedStatement.setInt(3,arr[2]);
            preparedStatement.setInt(4,arr[3]);
            preparedStatement.setInt(5,arr[4]);
            preparedStatement.executeUpdate();
            conn.close();
        }

        catch (Exception e){
            System.out.println("Error, I cannot connect to the database");
        }
        return true;
    }
}
