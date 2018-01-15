package Program;


import java.sql.*;


public class PolaczenieDB {
    public PolaczenieDB() {


        String data = "jdbc:mysql://localhost:3306/dane";
        try (
                Connection conn = DriverManager.getConnection(data,"root", "arcon8211");
                Statement st = conn.createStatement()
        )

        {
            Class.forName("com.mysql.jdbc.Driver");


            ResultSet rec = st.executeQuery(
                    "select Id, Imie, Nazwisko, " +
                            "from dane.osoba" +
                            " order by Id");
            while (rec.next()) {
                System.out.println("ID:\t" + rec.getString(1));
                System.out.println("Imie:\t" + rec.getString(2));
                System.out.println("Nazwisko:\t" + rec.getString(3));

                System.out.println();
            }
            st.close();
        } catch (SQLException s)

        {
            System.out.println("Błąd SQL: " + s.toString() + " "
                    + s.getErrorCode() + " " + s.getSQLState());
        } catch (
                Exception e)

        {
            System.out.println("Błąd: " + e.toString()
                    + e.getMessage());
        }

    }

}


