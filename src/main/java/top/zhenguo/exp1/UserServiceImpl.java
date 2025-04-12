package top.zhenguo.exp1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> getAllUsers() {
        return this.userMapper.getAllUsers();
    }

    public void deleteUser(Integer id) {
        System.out.println("删除了 id 为 " + id + " 的用户");
        this.userMapper.delete(id);
    }
}