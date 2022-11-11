import persistence.MyBatisConnectionFactory;
import persistence.dao.MenuManagementDAO;
import persistence.dao.StoreManagementDAO;
import persistence.dto.MenuDTO;
import persistence.dto.UsersDTO;
import java.util.List;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StoreManagementDAO mmd = new StoreManagementDAO(MyBatisConnectionFactory.getSqlSessionFactory());
        mmd.showStore(sc);
    }
}