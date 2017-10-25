package com.controller.commonsDButils;

import com.controller.commonsDButils.QueryRunnerDemo;
import com.sun.xml.internal.ws.developer.MemberSubmissionEndpointReference;
import com.controller.domain.Product;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class QueryRunnerDemo1 {
    private static Connection conn = QueryRunnerDemo.getConnection();

    public static void main(String[] args) throws SQLException {
//        ArrayHandler();
//        ArrayListHandler();
//        Beanandler();
//        BeanListHandler();
//        ColumnListHandler();
//        ScalarHandler();
//        MapHandler();
        MapListHandler();
    }

    /**
     * 结果集的第八种方法 MapListHandler
     * 将结果集中的每一行数据存储到Map集合中
     * Map<健，值> 健：列名 值：这列的数据
     * 存储到List
     */
    public static void MapListHandler() throws SQLException {
        QueryRunner qr = new QueryRunner();
        String sql = "SELECT * FROM company.product";
        List <Map <String, Object>> list = qr.query(conn, sql, new MapListHandler());

        for (Map <String, Object> map : list) {
            for (String i : map.keySet()) {
                Object value = map.get(i);
                System.out.print(i + "..." + value + " ");
            }
            System.out.println();
        }
    }

    /**
     * 结果集的第七种方法 MapHandler
     * 将结果集中的第一行数据，封装到map集合中
     * Map<健，值> 健：列名 值：这列的数据
     */
    public static void MapHandler() throws SQLException {
        QueryRunner qr = new QueryRunner();
        String sql = "SELECT * FROM company.product";
        Map <String, Object> map = qr.query(conn, sql, new MapHandler());

        for (String i : map.keySet()) {
            Object value = map.get(i);
            System.out.println(i +  "..." + value);
        }
    }


    /**
     * 结果集的第六种方法 ScalarHandler
     * 对于查询只处理一种结果
     */

    public static void ScalarHandler() throws SQLException {
        QueryRunner qr = new QueryRunner();
        String sql = "SELECT count(*) FROM company.product";
        Object count = qr.query(conn, sql, new ScalarHandler <Object>());
        System.out.println(count);
    }

    /**
     * 结果集的第五种方法 ColumnListHandler
     * 结果集，指定列是的数据，存储到List集合
     * List<object> 每个列数据类型不同
     */

    public static void ColumnListHandler() throws SQLException {
        QueryRunner qr = new QueryRunner();
        String sql = "SELECT * FROM company.product";
        List <Object> list = qr.query(conn, sql, new ColumnListHandler <Object>("pname"));
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    /**
     * 结果集的第四种方法 BeanListHandler
     * 将结果的每一行，封装成JavaBean对象中
     * 对象存储到List数组中
     */
    public static void BeanListHandler() throws SQLException {
        QueryRunner qr = new QueryRunner();
        String sql = "SELECT * FROM company.product";
        List <Product> list = qr.query(conn, sql, new BeanListHandler <Product>(Product.class));
        for (Product objs : list) {
            System.out.println(objs.toString());
        }
        DbUtils.close(conn);
    }

    /**
     * 结果集的第三种方法 Beanandler
     * 将结果的第一行，封装到javaBean
     */
    public static void Beanandler() throws SQLException {
        QueryRunner qr = new QueryRunner();
        String sql = "SELECT * FROM company.product";
        Product product = qr.query(conn, sql, new BeanHandler <Product>(Product.class));
        System.out.println(product);
        DbUtils.close(conn);
    }

    /**
     * 结果集的第二种方法 ArrayListHandler
     * 将结果的每一行，封装到对象数组中  出现很多对象数组
     * 对象存储到List数组中
     */
    public static void ArrayListHandler() throws SQLException {
        QueryRunner qr = new QueryRunner();
        String sql = "SELECT * FROM company.product";
        List <Object[]> result = qr.query(conn, sql, new ArrayListHandler());
        for (Object[] objs : result) {
            for (Object obj : objs) {
                System.out.print(obj + "\t");
            }
            System.out.println();
        }
        DbUtils.close(conn);
    }


    /**
     * 结果集的第一种方法 ArrayHandler
     * 将结果的第一行，封装到数组中  Object【】
     */
    public static void ArrayHandler() throws SQLException {
        QueryRunner qr = new QueryRunner();
        String sql = "SELECT * FROM company.product";
        Object[] result = qr.query(conn, sql, new ArrayHandler());
        for (Object obi : result) {
            System.out.print(obi + "\t");
        }
        DbUtils.close(conn);
    }
}
