package persistence.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import persistence.dto.OrderDTO;

import java.util.ArrayList;
import java.util.List;

public class OrderManagementDAO
{
    private final SqlSessionFactory sqlSessionFactory;

    public OrderManagementDAO(SqlSessionFactory sqlSessionFactory)
    {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    //주문생성
    public List<OrderDTO> createOrder()
    {
        List<OrderDTO> dtos = new ArrayList<>();
        SqlSession session = sqlSessionFactory.openSession();
        try
        {
            dtos = session.selectList("mapper.MenuMapper.registerOption"); //menu.xml에서 db 수정해야 함
            session.commit();
        }
        finally
        {
            session.rollback();
            session.close();
        }
        return dtos;
    }

    //주문조회
    public List<OrderDTO> showOrder()
    {
        List<OrderDTO> dtos = new ArrayList<>();
        SqlSession session = sqlSessionFactory.openSession();
        try
        {
            dtos = session.selectList("mapper.MenuMapper.registerOption"); //menu.xml에서 db 수정해야 함
            session.commit();
        }
        finally
        {
            session.rollback();
            session.close();
        }
        return dtos;
    }

    //주문접수
    public List<OrderDTO> acceptOrder()
    {
        List<OrderDTO> dtos = new ArrayList<>();
        SqlSession session = sqlSessionFactory.openSession();
        try
        {
            dtos = session.selectList("mapper.MenuMapper.registerOption"); //menu.xml에서 db 수정해야 함
            session.commit();
        }
        finally
        {
            session.rollback();
            session.close();
        }
        return dtos;
    }

    //주문취소
    public List<OrderDTO> cancelOrder()
    {
        List<OrderDTO> dtos = new ArrayList<>();
        SqlSession session = sqlSessionFactory.openSession();
        try
        {
            dtos = session.selectList("mapper.MenuMapper.registerOption"); //menu.xml에서 db 수정해야 함
            session.commit();
        }
        finally
        {
            session.rollback();
            session.close();
        }
        return dtos;
    }

    //재료소진
    public List<OrderDTO> noMaterial()
    {
        List<OrderDTO> dtos = new ArrayList<>();
        SqlSession session = sqlSessionFactory.openSession();
        try
        {
            dtos = session.selectList("mapper.MenuMapper.registerOption"); //menu.xml에서 db 수정해야 함
            session.commit();
        }
        finally
        {
            session.rollback();
            session.close();
        }
        return dtos;
    }

    //주문이력조회
    public List<OrderDTO> showOrderHistory()
    {
        List<OrderDTO> dtos = new ArrayList<>();
        SqlSession session = sqlSessionFactory.openSession();
        try
        {
            dtos = session.selectList("mapper.MenuMapper.registerOption"); //menu.xml에서 db 수정해야 함
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
