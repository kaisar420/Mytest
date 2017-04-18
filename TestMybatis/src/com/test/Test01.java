package com.test;

import com.mapping.MybatisUtil;
import com.model.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

/**
 * Created by iparhan on 4/16/17.
 */
public class Test01 {
//    public static void main(String[] args) {
//            String rresource = "conf.xml";
//        InputStream inputStream = Test01.class.getClassLoader().getResourceAsStream(rresource);
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        String  statement = "com.mapping.userMapping.getUser";
//        User user = sqlSession.selectOne(statement,1);
//
//        System.out.println(user);
//    }
    //https://github.com/kaisar420/Java_Mybatis.git
    /**
     * GetAllusers
     */
    @org.junit.jupiter.api.Test
    public void testGetAll(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        String statement = "com.mapping.userMapping.getAll";
        List<User> userList = sqlSession.selectList(statement);
        sqlSession.close();
        System.out.println(userList);

    }
}
