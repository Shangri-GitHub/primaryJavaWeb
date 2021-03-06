package controller.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;

public class JDBCUtils {
    private static BasicDataSource basicDataSource = new BasicDataSource();
    // 静态代码块，对basicDataSource对象中配置
    static {
        basicDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        basicDataSource.setUrl("jdbc:mysql://localhost:3306/company?characterEncoding=utf8&useSSL=true");
        basicDataSource.setUsername("root");
        basicDataSource.setPassword("root");
        // 连接池中的连接数
        basicDataSource.setInitialSize(10);
        basicDataSource.setMaxIdle(8);
        basicDataSource.setMinIdle(1);
    }
    // 定义静态方法，返回basicDataSource对象

    public static BasicDataSource getBasicDataSource() {
        return basicDataSource;
    }
}
