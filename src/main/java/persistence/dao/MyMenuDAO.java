package persistence.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import persistence.dto.MenuDTO;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MyMenuDAO { //MyBatis 사용
    private final SqlSessionFactory sqlSessionFactory;

    public MyMenuDAO(SqlSessionFactory sqlSessionFactory)
    {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    //메뉴옵션 등록
    public List<MenuDTO> registerOption()
    {
        List<MenuDTO> dtos = new ArrayList<>();
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

    //메뉴 등록
    public List<MenuDTO> registerMenu()
    {
        List<MenuDTO> dtos = new ArrayList<>();
        SqlSession session = sqlSessionFactory.openSession();
        try
        {
            dtos = session.selectList("mapper.MenuMapper.registerMenu"); //menu.xml에서 db 수정해야 함
            session.commit();
        }
        finally
        {
            session.rollback();
            session.close();
        }
        return dtos;
    }

    //전체 조회
    public List<MenuDTO> selectAll()
    {
        List<MenuDTO> dtos = new ArrayList<>();
        SqlSession session = sqlSessionFactory.openSession();
        try
        {
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

    //메뉴 수정
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

}
