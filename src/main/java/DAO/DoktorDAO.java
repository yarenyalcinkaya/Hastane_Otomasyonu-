
package DAO;

import Entity.Doktor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;


public class DoktorDAO {
     public List<Doktor> getAllDoktor(){
        
        
        return null;
    }
    
    
    
    public void sil(int id){
        
      
    }
    
    
    
    private Connection connection;

    public DoktorDAO() {
        this.connection = Database.getInstance().getConnection();
    }

    public void ekleDoktor(Doktor doktor) {
        String query = "INSERT INTO doktor (isim, soyisim, unvan,bashekim_id,bolum_id) VALUES (?, ?, ?,?,?)";
        
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, doktor.getAd());
            preparedStatement.setString(2, doktor.getSoyad());
            preparedStatement.setString(3, doktor.getUnvan());
            preparedStatement.setString(4, String.valueOf(doktor.getBashekim().getBashekim_id()));
             preparedStatement.setString(4, String.valueOf(doktor.getBolum().getBolum_id()));

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
