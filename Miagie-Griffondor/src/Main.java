//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.sql.*;
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Bienvenue chez les Griffondor !!");
        System.out.println("自己修改");
        
        try {
        	
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/projetjava";
            Connection con =  DriverManager.getConnection(url,"root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Professeur");
            while (rs.next()) {
            	int id =rs.getInt("idProfesseur");
            	String nom = rs.getString("nom");
            	String prenom = rs.getString("prenom");
            	System.out.println("id:" +id +"nom:"+nom +"prenom"+prenom);
            	
            	
            }
            rs.close();
            stmt.close();
            con.close();
        }
            catch( Exception e ) {
            	e.printStackTrace();
            	
        
        }

    }
   
}