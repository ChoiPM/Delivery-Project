package persistence.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import persistence.dto.MenuDTO;
import persistence.dto.UsersDTO;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ReviewManagementDAO
{
    private final SqlSessionFactory sqlSessionFactory;

    public ReviewManagementDAO(SqlSessionFactory sqlSessionFactory)
    {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    //리뷰작성

    //조회
}
