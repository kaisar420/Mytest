package com.mapping;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * Created by iparhan on 4/16/17.
 */
public class MybatisUtil {
    /***
     * GetSqlSessionFactory
     * @return
     */
    public static SqlSessionFactory getSqlSessionFactory(){
        String resource = "conf.xml";
        InputStream inputStream = MybatisUtil.class.getClassLoader().getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        return  sqlSessionFactory;
    }

    /**
     * getSqlsession
     * @return
     */
    public static SqlSession getSqlSession(){
        return getSqlSessionFactory().openSession();
    }

    /**
     * SqlSession  autoCommit
     * @param isAutoCommit
     * @return
     */
    public static SqlSession getSqlSession(boolean isAutoCommit){
        return getSqlSessionFactory().openSession(isAutoCommit);
    }
}
