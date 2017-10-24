package service;

import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        /**
         *   1 注册驱动 (使用发射技术)
         *   java.sql.DriverManager 类静态方法
         *   2 获得数据库的连接
         *   getConnection(String url, String user, String password)
         *
         *   3.获取语句执行平台，通过数据库连接对象，获取SQL语句的执行对象
         *
         *   4.执行sql语句
         */
//        DriverManager.registerDriver();
        Class.forName("com.mysql.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/company?characterEncoding=utf8&useSSL=true";
        String userName = "root";
        String passWord = "root";

        Connection connection = DriverManager.getConnection(url, userName, passWord);
        System.out.println(connection);
        Statement statement = connection.createStatement();

        System.out.println(statement);
//        int row = statement.executeUpdate("INSERT INTO company.product(pname, price) VALUES ('包子', 1.50)");
//        System.out.println(row);

        ResultSet res = statement.executeQuery("SELECT * FROM company.product");
        System.out.println(res);
        while (res.next()) {
//            获取每列数据
            System.out.println(res.getInt("Id")+res.getString("pname")+res.getDouble("price"));
        }



        connection.close();
        statement.close();
    }


}





