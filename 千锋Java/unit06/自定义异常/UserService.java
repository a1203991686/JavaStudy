package com.unit06.自定义异常;

/**
 * @author littlecorgi_a1203991686@126.com on 2018/07/28 19:41
 */
public class UserService {
    public User login (String username, String password)throws MyException {
        if (!"admin".equals(username)){
            throw new MyException("用户名错误");
        }
        if (!"12345".equals(password)){
            throw new MyException("密码错误");
        }
        User user = new User("admin", "12345", 18, "男");
        return user;
    }
}
