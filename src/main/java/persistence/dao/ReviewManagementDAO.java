package persistence.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import persistence.dto.ReviewDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReviewManagementDAO
{
    private final SqlSessionFactory sqlSessionFactory;

    public ReviewManagementDAO(SqlSessionFactory sqlSessionFactory)
    {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    //리뷰작성
    public List<ReviewDTO> writeReview()
    {
        List<ReviewDTO> dtos = new ArrayList<>();
        SqlSession session = sqlSessionFactory.openSession();
        try
        {
            dtos = session.selectList("mapper.ReviewMapper.writeReview");
            session.commit();
        }
        finally
        {
            session.rollback();
            session.close();
        }
        return dtos;
    }

    //조회
    public List<ReviewDTO> showReview(Scanner sc)
    {
        List<ReviewDTO> dtos = new ArrayList<>();
        SqlSession session = sqlSessionFactory.openSession();
        try
        {
            dtos = session.selectList("mapper.ReviewMapper.");
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
