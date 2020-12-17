package test;

import org.junit.Test;

import java.sql.*;
import java.util.Properties;
import org.postgresql.Driver;

public class JdbcTEst {
    @Test
    public void dummy() throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");

        String url = "jdbc:postgresql://";
        Connection conn = DriverManager.getConnection(url);
    }
}
