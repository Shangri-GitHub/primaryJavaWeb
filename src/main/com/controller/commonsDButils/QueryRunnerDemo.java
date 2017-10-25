package com.controller.commonsDButils;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapListHandler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * insert update delete
 * QueryRunnner类的update（connect con, String sql , Object ... params）
 */

public class QueryRunnerDemo {

    /**
     * 获取连接connection con
     */
    private static Connection conn;

    public static Connection getConnection() {
        String driverClassName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/company?characterEncoding=utf8&useSSL=true";
        String username = "root";
        String password = "root";
        Connection conn = null;
        DbUtils.loadDriver(driverClassName);
        try {
            conn = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void main(String[] args) throws SQLException {
//        insert();
//        query();
//        modify();
        delete();

    }

    public static void insert() throws SQLException {

        conn = getConnection();
        /**
         * 创建QueryaRunner类对象
         * 插入
         */
        QueryRunner qr = new QueryRunner();

        String sql = "INSERT INTO product (pname,price) VALUES(?,?)";
        Object[] params = {"桃子", 2.23};
        int row = qr.update(conn, sql, params);
        System.out.println(row);
        DbUtils.closeQuietly(conn);
    }

    public static void query() {

        conn = getConnection();
        /**
         * 创建QueryaRunner类对象
         * 插入
         */
        QueryRunner qr = new QueryRunner();
        /**
         * 查询
         */
        List al = null;
        try {
            al = qr.query(conn, "select * from product", new MapListHandler());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Iterator ite = al.iterator();
        while (ite.hasNext()) {
            Map map = (Map) ite.next();
            System.out.println(map.get("pname"));
        }
    }

    public static void modify() throws SQLException {
        conn = getConnection();
        QueryRunner qr = new QueryRunner();
        String sql = "UPDATE product SET pname=?,price=? where ID=?";
        //定义Object数组，存储？中的参数；
        Object[] params = {"玫瑰", "2.5", 4};
        int row = qr.update(conn, sql, params);
        System.out.println(row);
        DbUtils.closeQuietly(conn);

    }

    public static void delete() throws SQLException {
        conn = getConnection();
        QueryRunner qr = new QueryRunner();
        String sql = "DELETE FROM product where Id=?";
        int row = qr.update(conn, sql, 7);
        System.out.println(row);
    }
}
