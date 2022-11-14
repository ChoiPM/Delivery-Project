import persistence.MyBatisConnectionFactory;
import persistence.dao.ReviewManagementDAO;
import persistence.dao.StoreManagementDAO;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StoreManagementDAO mmd = new StoreManagementDAO(MyBatisConnectionFactory.getSqlSessionFactory());
        mmd.showStore(sc);

        ReviewManagementDAO rmd = new ReviewManagementDAO(MyBatisConnectionFactory.getSqlSessionFactory());
        rmd.writeReview();
    }
}