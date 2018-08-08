package mysqlconnct;/**
 * @Project:Test0719
 * @Author :maxiaodong
 * @Time :2018/08/08
 * @Desc :mysqlJava链接
 */

import java.sql.*;

import static java.lang.System.out;

/**
 * @Project:Test0719
 * @Author :maxiaodong
 * @Time :2018/08/08
 * @Desc :mysqlJava链接
 */
public class MysqlConnect {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://????:???/????useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull";

    static final String USER = "???";
    static final String PASS = "????";

    public static void main(String[] args) {
        Connection conn = null;
        Statement statement = null;

        try {

            //注册jdbc驱动
            Class.forName(JDBC_DRIVER);
            //com.mysql.jdbc.Driver driver = new com.mysql.jdbc.Driver();
            //DriverManager.registerDriver(driver);

            //打开链接
            out.println("打开数据库");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);//必须在调用getConnection之前保证相应的driver类已经被加载到jvm中。并且完成了类的初始化工作
            //执行查询
            out.println("实例化statement对象");
            statement = conn.createStatement();
            String sql = "";
            sql = "select * from shield_ip";
            ResultSet rs1 = statement.executeQuery(sql);

            String preStatement = "select * from shield_ip where country = ?";
            PreparedStatement preState = conn.prepareStatement(preStatement);
            preState.setString(1, "中国");
            ResultSet rs = preState.executeQuery();


            //展开结果集数据库
            while (rs.next()) {
                //通过字段检索
                int id = rs.getInt("id");
                String ip = rs.getString("ip");
                String country = rs.getString("country");
                String province = rs.getString("province");
                out.println("id:" + id + ",ip:" + ip + ",country:" + country + ",province:" + province);
            }
            //完成后关闭
            rs.close();
            statement.close();
            conn.close();
        } catch (SQLException se) {
            //处理jdbc错误
            se.printStackTrace();
        } catch (Exception e) {
            //处理class.forname的错误
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) statement.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        out.println("完成连接");

    }

}
