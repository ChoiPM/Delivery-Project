package persistence.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import persistence.dto.MenuDTO;
import persistence.dto.MenuOptionDTO;
import persistence.dto.UsersDTO;

import java.util.ArrayList;
import java.util.List;

public class MenuManagementDAO {
    private final SqlSessionFactory sqlSessionFactory;

    public MenuManagementDAO(SqlSessionFactory sqlSessionFactory)
    {
        this.sqlSessionFactory = sqlSessionFactory;
    }


    public List<MenuDTO> registerOption()
    {
        List<MenuDTO> dtos = new ArrayList<>();
        SqlSession session = sqlSessionFactory.openSession();
        try
        {
            dtos = session.selectList("mapper.MenuMapper.registerOption");
            session.commit();
        }
        finally
        {
            session.rollback();
            session.close();
        }
        return dtos;
    }

    public List<MenuDTO> registerMenu()
    {
        List<MenuDTO> dtos = new ArrayList<>();
        SqlSession session = sqlSessionFactory.openSession();
        try
        {
            dtos = session.selectList("mapper.MenuMapper.registerMenu");
            session.commit();
        }
        finally
        {
            session.rollback();
            session.close();
        }
        return dtos;
    }


    public List<MenuDTO> selectAll(MenuDTO menuDTO)
    {
        List<MenuDTO> dtos = new ArrayList<>();
        SqlSession session = sqlSessionFactory.openSession();
        try
        {
            dtos = session.selectList("mapper.MenuMapper.selectAll");
        }
        finally
        {
            session.close();
        }
        return dtos;
    }


    public List<MenuDTO> modifyMenu()
    {
        List<MenuDTO> dtos = new ArrayList<>();
        SqlSession session = sqlSessionFactory.openSession();
        try
        {
            dtos = session.selectList("mapper.MenuMapper.modifyMenu");
            session.commit();
        }
        finally
        {
            session.rollback();
            session.close();
        }
        return dtos;
    }
    public List<MenuOptionDTO> selectAll()
    {
        List<MenuOptionDTO> dtos = new ArrayList<>();
        SqlSession session = sqlSessionFactory.openSession();
        try
        {
            System.out.println("menuOption selectAll");
            dtos = session.selectList("mapper.MenuMapper.selectAll");
            session.commit();
        }
        finally
        {
            session.rollback();
            session.close();
        }
        return dtos;
    }

    public  void printAll(List<MenuOptionDTO> dtos)
    {
        for(MenuOptionDTO dto:dtos)
        {
            System.out.println("dto.toString = " + dto.toString());
        }
    }
}