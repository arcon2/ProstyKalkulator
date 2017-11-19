package Program;

import java.sql.*;


public class BazaDanych {


    public static final String sterownik = "com.mysql.jdbc.Driver";
    public static final String baza = "jdbc:mysql://localhost:3306/dane";

    Connection conn;
    Statement stat;


    public BazaDanych() {
        try {
            Class.forName(BazaDanych.sterownik);
        } catch (ClassNotFoundException e) {
            System.err.println("Brak sterownika");
            e.printStackTrace();
        }
        try {
            conn = DriverManager.getConnection(baza, "root", "arcon8211");
            stat = conn.createStatement();
        } catch (SQLException e) {
            System.err.println("Problem z otwarciem połaczenia");
            e.printStackTrace();
        }
    }


    public void wyswietl() throws SQLException {


        try {
            ResultSet wynik = stat.executeQuery("select Id,Imie,Nazwisko " + "from dane.osoba" + " ORDER BY Id");
            while (wynik.next()) {
                System.out.println("ID:\t" + wynik.getString(1));
                System.out.println("Imie:\t" + wynik.getString(2));
                System.out.println("Nazwisko:\t" + wynik.getString(3));

                System.out.println();
            }

        } finally {

        }


    }

}
