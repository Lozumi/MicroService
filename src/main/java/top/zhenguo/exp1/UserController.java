package top.zhenguo.exp1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/userList")
    public List<User> getAllUsers() {
        return this.userService.getAllUsers();
    }

    @GetMapping("/delete")
    public void delete(@RequestParam Integer id) {
        this.userService.deleteUser(id);
    }
}