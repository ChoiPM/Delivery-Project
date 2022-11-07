package persistence.dao;

import persistence.PooledDataSource;
import persistence.dto.UsersDTO;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class UsersDAO
{
    //get-가 static이기 때문에 new keyword를 사용하지 않더라도 class method 호출 가능
    private final DataSource ds = PooledDataSource.getDataSource();
    public List<UsersDTO> findAll() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        //BoardDTO에 제목, 글쓴이, 내용, 조회수 등을 DTO에 담고, 그 DTO를 DAO에 넣음
        //ArrayList는 한 건 한 건을 모아놓은 list
        List<UsersDTO> usersDTOs = new ArrayList<>();

        //try 안->비즈니스 로직
        try {
            //PooledDataSource를 사용하기 때문에 사용되지 않는 것들은 주석 처리
            //Class.forName("com.mysql.jdbc.Driver"); //java 7이후 생략 가능
            //Class.forName("com.mysql.cj.jdbc.Driver");
            //String url = "jdbc:mysql://localhost/mydb?characterEncoding=utf8&serverTimezone=UTC&useSSL=false";
            //String url = "jdbc:mysql://localhost/mydb";
            //conn = DriverManager.getConnection(url, "root", "dkdud020604");
            //conn.setAutoCommit(false);

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

                //데이터 바인딩(묶다)(=매핑)
                /*usersDTO.setIdNum(idNum);
                usersDTO.setContents(contents);
                usersDTO.setHit(hit);
                usersDTO.setRegDate(regdate);
                usersDTO.setTitle(title);
                usersDTO.setWriter(writer);*/
                //귀찮으니까 바인딩을 자동으로 해보자

                //ArrayList에 DTO를 넣는 코드
                usersDTOs.add(usersDTO);
            }
//            conn.commit();
        }
        // 여기부터 boilier plate code .. try catch 대신 try-with-resource 로 간소화 가능
//        catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
        catch (SQLException e) {
//            try {
//                conn.rollback();
//            } catch (SQLException s) {
//                e.printStackTrace();
//            }
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

        //DTO ArrayList를 return
        return usersDTOs;
    }
}