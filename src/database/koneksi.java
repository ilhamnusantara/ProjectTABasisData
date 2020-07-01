

package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author ilham-07010
 */
public class koneksi {
    private Connection connect;
    private Statement db;
    private String database = "ilham";
    
    public koneksi(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Class Driver Ditemukan");
            
            try{
                connect = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ilham_07010"/*username*/, "ilham"/*pass*/);
                System.out.println("Koneksi Datatbase sukses");
            } catch (SQLException se){
                System.out.println("Koneksi Database gagal = " + se);
            }
    } catch (ClassNotFoundException err){
            System.out.println("Class Driver Tidak Ditemukkan, Terjadi kesalahan pada : "+err);
        }
    }
    
    public ResultSet GetData(String sql){
        try {
            db = connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            return db.executeQuery(sql);
        } catch (SQLException e){
            return null;
        }
    }
    
    public int ManipulasiData (String sql){
        try {
            db = connect.createStatement();
            return db.executeUpdate(sql);
        } catch (SQLException e){
            return 0;
        }
    }
}
