package persistence.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import persistence.dto.StoreDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StoreManagementDAO
{
    private final SqlSessionFactory sqlSessionFactory;
    public StoreManagementDAO(SqlSessionFactory sqlSessionFactory)
    {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    //매장등록
    public List<StoreDTO> registerStore()
    {
        List<StoreDTO> dtos = new ArrayList<>();
        SqlSession session = sqlSessionFactory.openSession();
        try
        {
            dtos = session.selectList("mapper.StoreMapper.registerStore");
            session.commit();
        }
        finally
        {
            session.rollback();
            session.close();
        }
        return dtos;
    }

    //매장조회
    public List<StoreDTO> showStore(Scanner sc)
    {
        String storeName = sc.nextLine();
        List<StoreDTO> dtos = new ArrayList<>();
        SqlSession session = sqlSessionFactory.openSession();
        try
        {
            dtos = session.selectList("mapper.StoreMapper.showStore", storeName);
            session.commit();
        }
        finally
        {
            session.rollback();
            session.close();
        }
        return dtos;
    }
}