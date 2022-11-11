import persistence.MyBatisConnectionFactory;
import persistence.dao.MenuManagementDAO;
import persistence.dto.MenuDTO;
import persistence.dto.UsersDTO;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        MenuManagementDAO myMenuDAO = new MenuManagementDAO(MyBatisConnectionFactory.getSqlSessionFactory());
        UsersDTO usersDTO = new UsersDTO();
        usersDTO.setId("sorim");

        List<MenuDTO> posts3 = myMenuDAO.selectAll(usersDTO);
        System.out.println("posts2.size() = " + posts3.size());
        posts3.stream().forEach(p -> System.out.println(p.toString()));
        //코드 수정용
    }
}