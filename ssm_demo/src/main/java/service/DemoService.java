package service;

import dao.DemoDao;
import domain.User;
import org.springframework.stereotype.Service;
import util.MyUtil;

@Service("DemoService")
public class DemoService {
    private DemoDao dao = MyUtil.getMapper(DemoDao.class,true);

    public String selectOne(User user){
        System.out.println("service执行");
        User us= dao.selectone(user.getName());
        if (user!=null){
            System.out.println(us.getPassword());
            if (us.getName().equals(user.getName())&&us.getPassword().equals(user.getPassword())){
                return "登录成功";
            }
        }
        return "账号或密码错误";
    }
}
