package swift2018_1.hristo.hwk_15.Task2;

import java.sql.*;

public class MySqlAddressData {

    public static void getFullAddress(Integer id){

        final String url = "jdbc:mysql://localhost:3306/school?useSSL=false";
        final String user = "root";
        final String password = "easy";

        try {
            Connection conn = DriverManager.getConnection(
                    url, user, password);

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select number, street, apartmentNo, city, country " +
                    "FROM school.addresses where id = "+id+";");

            rs.next();
            StringBuilder sb = new StringBuilder();
            ResultSetMetaData rsmd = rs.getMetaData();
            int numberOfColumns = rsmd.getColumnCount();
            for (int i = 1; i <= numberOfColumns; i++) {
                sb.append(rs.getString(i));
                if (i < numberOfColumns) {
                    sb.append(", ");
                }
            }
            String data = sb.toString();
            System.out.println(data);


        }catch (Exception ex){
            System.err.println("Got an exception!");
            System.err.println(ex.getMessage());
        }
    }

    public static void addAddress(String country, String city, String street, Integer number,
                                  Integer floor, Integer apartmentNo){

        final String url = "jdbc:mysql://localhost:3306/school?useSSL=false";
        final String user = "root";
        final String password = "easy";

        try (Connection conn = DriverManager.getConnection(
                url, user, password);

             CallableStatement statement = conn.prepareCall( " {call insertAddress(?,?,?,?,?,?)}")) {
            statement.setString("new_country", country);
            statement.setString("new_city", city);
            statement.setString("new_street", street);
            statement.setInt("new_number", number);
            statement.setInt("new_floor", floor);
            statement.setInt("new_apartmentNo", apartmentNo);
            statement.execute();

        }
        catch (Exception ex){
            System.err.println("Got an exception!");
            System.err.println(ex.getMessage());
        }
    }

    public static void getAddresses(String country) {

        final String url = "jdbc:mysql://localhost:3306/school?useSSL=false";
        final String user = "root";
        final String password = "easy";

        try {
            Connection conn = DriverManager.getConnection(
                    url, user, password);

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select country, city, street, number, floor, apartmentNo " +
                    "FROM school.addresses where country = '" + country + "';");

            while (rs.next()) {
                StringBuilder sb = new StringBuilder();
                ResultSetMetaData rsmd = rs.getMetaData();
                int numberOfColumns = rsmd.getColumnCount();
                for (int i = 1; i <= numberOfColumns; i++) {
                    sb.append(rs.getString(i));
                    if (i < numberOfColumns) {
                        sb.append(", ");
                    }
                }
                String data = sb.toString();
                System.out.println(data);
            }


        } catch (Exception ex) {
            System.err.println("Got an exception!");
            System.err.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {

        //getFullAddress(12);
        //addAddress("Greece", "Athens", "Tzar Simeon", 4, 3, 9);
        getAddresses("Bulgaria");
    }
}
