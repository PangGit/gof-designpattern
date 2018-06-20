package flyweight.gof;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @Description : 享元 测试
 */
public class FlyweightTest {

    public static void main(String[] args) throws SQLException {

        ConnectionPool connectionPool = new ConnectionPool();
        connectionPool.release();
        Connection conn = connectionPool.getConnection();

        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from user");

        while (resultSet.next()) {
            System.out.println(resultSet.getString("username"));
        }

    }

}
