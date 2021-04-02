package util;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyUtil {

    private static SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Thread.currentThread().getContextClassLoader().getResourceAsStream("mybatis/configuration.xml"));

    //提供sqlSession对象
    public static SqlSession getSqlSession(){
        return factory.openSession();
    }

    public static SqlSession getSqlSession(boolean flag){
        return factory.openSession(flag);
    }

    //获取mapper对象
    public static <T>T getMapper(Class clazz){
        return (T) getSqlSession().getMapper(clazz);
    }
    public static <T>T getMapper(Class clazz,boolean flag){
        return (T)getSqlSession(flag).getMapper(clazz);
    }
}
