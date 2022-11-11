package persistence.dao;

import persistence.PooledDataSource;
import persistence.dto.UsersDTO;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class UsersDAO
{ // 지워도 됨
    private final DataSource ds = PooledDataSource.getDataSource();
    public List<UsersDTO> findAll() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        List<UsersDTO> usersDTOs = new ArrayList<>();

        try {
            conn = ds.getConnection();

            String query = "SELECT * FROM BOARD";

            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);

            while (rs.next()) {
                UsersDTO usersDTO = new UsersDTO();
                Long idNum = rs.getLong("user_id");
                String id = rs.getString("board_id");
                String password = rs.getString("password");
                String phoneNum = rs.getString("phone");
                String email = rs.getString("email");
                String grade = rs.getString("grade");
                String role = rs.getString("role");
                String address = rs.getString("current_address");
                LocalDateTime createdDate = rs.getTimestamp("created_date").toLocalDateTime();
                LocalDateTime modifiedDate = rs.getTimestamp("modified_date").toLocalDateTime();
                String status = rs.getString("status");

                usersDTOs.add(usersDTO);
            }
        }

        catch (SQLException e) {
            System.out.println("error : " + e);
        } finally {
            try {
                if (conn != null && !rs.isClosed()) {
                    rs.close();
                }
                if (conn != null && !stmt.isClosed()) {
                    rs.close();
                }
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return usersDTOs;
    }
}