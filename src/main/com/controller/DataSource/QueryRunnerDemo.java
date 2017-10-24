package controller.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayListHandler;

import java.sql.SQLException;
import java.util.List;

public class QueryRunnerDemo {
    public static void main(String[] args) {
//        insert();
        query();
    }

    private static QueryRunner qr = new QueryRunner(JDBCUtils.getBasicDataSource());

    public static void insert() {
        String sql = "INSERT INTO product (pname,price) VALUES(?,?)";
        Object[] params = {"人参果", 11.23};
        try {
            int row = qr.update(sql, params);
            System.out.println(row);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void query() {
        String sql = "SELECT * FROM product";
        try {
            List <Object[]> result = qr.query(sql, new ArrayListHandler());
            for (Object[] objs : result) {
                for (Object obj : objs) {
                    System.out.print(obj + "\t");
                }
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
