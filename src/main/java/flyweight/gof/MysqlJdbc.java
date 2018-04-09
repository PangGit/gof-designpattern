package flyweight.gof;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MysqlJdbc {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            // 连接URL为 jdbc:mysql//服务器地址/数据库名 ，后面的2个参数分别是登陆用户名和密码
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false", "root", "root");

            System.out.println("Success connect Mysql server!");

            Statement stmt = connect.createStatement();

            ResultSet rs = stmt.executeQuery("select * from user"); // user为你表的名称

            while (rs.next()) {
                System.out.println(rs.getString("username"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}