package dao;

import domain.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository("DemoDao")
public interface DemoDao {
    @Select("select name,password from user")
    User selectone(String name);
}
