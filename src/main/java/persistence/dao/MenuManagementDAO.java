package persistence.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import persistence.PooledDataSource;
import persistence.dto.MenuDTO;
import persistence.dto.MenuOptionDTO;
import persistence.dto.StoreDTO;
import persistence.dto.UsersDTO;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MenuManagementDAO {
    private final SqlSessionFactory sqlSessionFactory;
    private final DataSource ds= PooledDataSource.getDataSource();

    public MenuManagementDAO(SqlSessionFactory sqlSessionFactory)
    {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public List<MenuDTO> registerMenu(Map<String, Object> params)
    {
        List<MenuDTO> dtos = null;
        SqlSession session = sqlSessionFactory.openSession();
        try
        {
            dtos = session.selectList("mapper.MenuMapper.registerMenu",params);
        }
        finally
        {
            session.close();
        }
        return dtos;
    }
    public List<MenuDTO> showAll()
    {
        List<MenuDTO> dtos = new ArrayList<>();
        SqlSession session = sqlSessionFactory.openSession();
        try
        {
            dtos = session.selectList("mapper.MenuMapper.showAll");
            session.commit();
        }
        finally
        {
            session.rollback();
            session.close();
        }
        return dtos;
    }
    public List<MenuDTO> modifyMenu2param(Map<String, Object> params)
    {
        List<MenuDTO> dtos = null;
        SqlSession session = sqlSessionFactory.openSession();
        try
        {
            System.out.println("modifyMenu");
            dtos = session.selectList("mapper.MenuMapper.modifyMenu2params",params);
        }
        finally
        {
            session.close();
        }
        return dtos;
    }
    public List<MenuDTO> modifyMenuName(Map<String, Object> params)
    {
        List<MenuDTO> dtos = null;
        SqlSession session = sqlSessionFactory.openSession();
        try
        {
            dtos = session.selectList("mapper.MenuMapper.modifyMenuName",params);
        }
        finally
        {
            session.close();
        }
        return dtos;
    }
    public List<MenuDTO> modifyMenuPrice(Map<String, Object> params)
    {
        List<MenuDTO> dtos = null;
        SqlSession session = sqlSessionFactory.openSession();
        try
        {
            dtos = session.selectList("mapper.MenuMapper.modifyMenuPrice",params);
        }
        finally
        {
            session.close();
        }
        return dtos;
    }


    public List<MenuDTO> selectAll()
    {
        List<MenuDTO> dtos = new ArrayList<>();
        SqlSession session = sqlSessionFactory.openSession();
        try
        {
            System.out.println("menu selectAll");
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
    public List<MenuOptionDTO> RegisterOption(Map<String, Object> params)
    {
        List<MenuOptionDTO> dtos = null;
        SqlSession session = sqlSessionFactory.openSession();
        try
        {
            System.out.println("registMenuOption");
            dtos = session.selectList("mapper.MenuMapper.registerMenuOption",params);
        }
        finally
        {
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