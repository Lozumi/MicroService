package top.zhenguo.exp1;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void deleteUser(Integer id);
}