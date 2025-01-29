import java.sql.*;

public class DatabaseConnection {

    public static void main(String[] args) throws Exception {
        Class.forName("org.postgresql.Driver");
        Connection cx = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/db", "georgio", "gio");
        // Il faut avoid ici les
        Statement st = cx.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM persons");
        while (rs.next()) {
            int personID = rs.getInt("person_id");
            String nom = rs.getString("name");
            int age = rs.getInt("age");
            System.out.println(nom + " a " + age + " ans");
        }
        rs.close();
        st.close();
        cx.close();
    }
}