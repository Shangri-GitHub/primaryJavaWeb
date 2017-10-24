package service;

import java.sql.*;
import java.util.Scanner;

public class LoginDemo {
    public static void main(String[] args) throws Exception {

//        Class.forName("com.mysql.jdbc.Driver");
//
//        String url = "jdbc:mysql://localhost:3306/company?characterEncoding=utf8&useSSL=true";
//        String userName = "root";
//        String passWord = "root";
//
//        Connection connection = DriverManager.getConnection(url, userName, passWord);
//
//        Statement statement = connection.createStatement();
//        Scanner sc = new Scanner(System.in);
//        String use = sc.nextLine();
//        String pass = sc.nextLine();
////        执行sql语句判断正确还是失败
//        String sql = "SELECT * FROM login where account = '" + use + "' and password = '" + pass + "'";
//        /**
//         * 控制台输入 sql注入
//         * a
//         * q 'or' 1=1
//         */
//        System.out.println(sql);
//        ResultSet res = statement.executeQuery(sql);
//        while (res.next()) {
//            System.out.println(res.getObject("account") + res.getString("password"));
//        }
//        res.close();
//        statement.close();
//        connection.close();



        /**
         * 防止注入攻击
         * 有一个子接口preparedStatement(String sql)
         * sql 语句全部用占位符 ？
         */
        Class.forName("com.mysql.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/company?characterEncoding=utf8&useSSL=true";
        String userName = "root";
        String passWord = "root";

        Connection connection = DriverManager.getConnection(url, userName, passWord);

        Scanner sc = new Scanner(System.in);
        String use = sc.nextLine();
        String pass = sc.nextLine();

        String sql1 = "SELECT * FROM login where account = ? and password = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql1);
        preparedStatement.setObject(1,use);
        preparedStatement.setObject(2,pass);
        ResultSet res = preparedStatement.executeQuery();
        while (res.next()) {
            System.out.println(res.getObject("account") + res.getString("password"));
        }

        res.close();
        preparedStatement.close();
        connection.close();

    }
}
