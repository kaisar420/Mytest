package com.test;

import com.mapping.MybatisUtil;
import com.model.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

/**
 * Created by iparhan on 4/16/17.
 */

public class TestOneCache {
    @Test
    public void testCache01() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        String statement = "com.mapping.userMapping.getUser";
        User user = sqlSession.selectOne(statement, 1);
        System.out.println(user);


        user = sqlSession.selectOne(statement,1);
        System.out.println(user);
        sqlSession.close();

        sqlSession =MybatisUtil.getSqlSession();
        user = sqlSession.selectOne(statement,1);
        System.out.println(user);

        user = sqlSession.selectOne(statement,2);
        System.out.println(user);

        user =  sqlSession.selectOne(statement,2);
        System.out.println(user);



    }

}
