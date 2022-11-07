import persistence.MyBatisConnectionFactory;
import persistence.dao.MyUsersDAO;
import persistence.dto.UsersDTO;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        MyUserDAO myBoardDAO = new MyUserDAO(MyBatisConnectionFactory.getSqlSessionFactory());
        UsersDTO usersDTO = new UsersDTO();
        usersDTO.setId("sorim");

        List<UsersDTO> posts3 = myBoardDAO.findPostWithTitleNameLike3(usersDTO);
        System.out.println("posts2.size() = " + posts3.size());
        posts3.stream().forEach(p -> System.out.println(p.toString()));
    }
}