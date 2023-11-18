package com.klef.ep.ManagedBean;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TouristBean {
    private final String url = "jdbc:mysql://localhost:3306/klu";
    private final String user = "root";
    private final String password = "root";

    public List<Tourist> getAllTourists() {
        List<Tourist> tourists = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/klu"l, "root", "root");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM tourist");

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String city = resultSet.getString("city");
                int phone = resultSet.getInt("phone");
                Tourist tourist = new Tourist(id, name, city, phone);
                tourists.add(tourist);
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tourists;
    }
}
