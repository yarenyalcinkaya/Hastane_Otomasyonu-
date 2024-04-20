
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Database {
    private static Database instance;
    private Connection connection;
    
    private static final String URL= "jdbc:postgresql://localhost:5432/Hastane Otomasyonu";
    private static final String KULLANICI_ADI="postgres";
    private static final String SIFRE="123456";
    
    Database(){
            try{
                Class.forName("org.postgresql.Driver");
                connection= DriverManager.getConnection(URL,KULLANICI_ADI,SIFRE);
            }catch(ClassNotFoundException | SQLException e){
                e.printStackTrace();
            }
        
    }
    public static synchronized Database getInstance(){
        if (instance == null){
            instance = new Database();
        }
        return instance;
    }
    public Connection getConnection(){
        return connection;
    }
    
    
}
