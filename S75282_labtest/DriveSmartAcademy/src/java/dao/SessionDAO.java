package dao;

import bean.SessionBean;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SessionDAO {

    private String dbURL =
            "jdbc:mysql://localhost:3306/drivesmart_db";

    private String dbUser = "root";
    private String dbPass = "";

    public Connection getConnection() {

        Connection con = null;

        try {

            Class.forName(
            "com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                    dbURL,
                    dbUser,
                    dbPass);

        } catch(Exception e) {
            e.printStackTrace();
        }

        return con;
    }

    public boolean bookSession(SessionBean session) {

        boolean rowInserted = false;

        try {

            Connection con = getConnection();

            String sql =
            "INSERT INTO training_sessions "
            + "(student_name,branch_location,"
            + "lesson_type,status) "
            + "VALUES(?,?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1,
                    session.getStudent_name());

            ps.setString(2,
                    session.getBranch_location());

            ps.setString(3,
                    session.getLesson_type());

            ps.setString(4,
                    session.getStatus());

            rowInserted =
                    ps.executeUpdate() > 0;

            con.close();

        } catch(Exception e) {
            e.printStackTrace();
        }

        return rowInserted;
    }

    public List<SessionBean> getAllSessions() {

        List<SessionBean> list =
                new ArrayList<>();

        try {

            Connection con =
                    getConnection();

            String sql =
            "SELECT * FROM training_sessions "
            + "ORDER BY branch_location ASC";

            Statement st =
                    con.createStatement();

            ResultSet rs =
                    st.executeQuery(sql);

            while(rs.next()) {

                SessionBean s =
                        new SessionBean();

                s.setSession_id(
                        rs.getInt("session_id"));

                s.setStudent_name(
                        rs.getString("student_name"));

                s.setBranch_location(
                        rs.getString("branch_location"));

                s.setLesson_type(
                        rs.getString("lesson_type"));

                s.setStatus(
                        rs.getString("status"));

                list.add(s);
            }

            con.close();

        } catch(Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}