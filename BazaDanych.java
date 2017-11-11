package Program;

import java.sql.*;

import static java.sql.DriverManager.*;

public class BazaDanych
{

    static String daneZBazy;
    /**
     * @param args
     */
    //public static void main(String[] args) {
    public void baza(){
        String polaczenieURL = "jdbc:mysql://192.168.1.4/test?user=test&password=test";
        //Tworzymy proste zapytanie doa bazy danych
        String query = "Select * FROM osoba";

        Connection conn = null;

        try {

            //Ustawiamy dane dotyczące podłączenia
            conn = DriverManager.getConnection(polaczenieURL);

            //Ustawiamy sterownik MySQL
            Class.forName("com.mysql.jdbc.Driver");

            //Uruchamiamy zapytanie do bazy danych
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                wyswietlDaneZBazy(rs);
            }

            conn.close();
        }
        //Wyrzuć wyjątki jężeli nastąpią błędy z podłączeniem do bazy danych lub blędy zapytania o dane
        catch(ClassNotFoundException wyjatek) {
            System.out.println("Problem ze sterownikiem");
        }

        catch(SQLException wyjatek) {
            //e.printStackTrace();
            //System.out.println("Problem z logowaniem\nProsze sprawdzic:\n nazwę użytkownika, hasło, nazwę bazy danych lub adres IP serwera");
            System.out.println("SQLException: " + wyjatek.getMessage());
            System.out.println("SQLState: " + wyjatek.getSQLState());
            System.out.println("VendorError: " + wyjatek.getErrorCode());
        }

    }
    static void wyswietlDaneZBazy(ResultSet rs){
        try{
            daneZBazy = rs.getString(1);
            System.out.println("\n" + daneZBazy + " ");
            daneZBazy = rs.getString(2);
            System.out.println(daneZBazy + " ");
            daneZBazy = rs.getString(3);
            System.out.println(daneZBazy);
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
