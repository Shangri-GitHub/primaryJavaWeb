package controller.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * 连接池jar包中，定义好一个类BasicDataSource
 * 实现类的规范接口 javax.sql.DataSource
 */
public class DataSourceDemo {
    public static void main(String[] args) {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/company?characterEncoding=utf8&useSSL=true");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        try {
            Connection conn = dataSource.getConnection();
            System.out.println(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
