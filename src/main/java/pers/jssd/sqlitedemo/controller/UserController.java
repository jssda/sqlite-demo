package pers.jssd.sqlitedemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.jssd.sqlitedemo.pojo.User;
import pers.jssd.sqlitedemo.repository.UserRepository;

/**
 * @author jssd
 */
@RestController
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * 新增一条数据
     */
    @RequestMapping("/add")
    public User add(String name) {
        User user = new User();
        user.setName(name);
        return userRepository.save(user);
    }

    /**
     * 查询所有数据
     */
    @RequestMapping("/list")
    public Iterable<User> list() {
        Iterable<User> all = userRepository.findAll();
        return all;
    }
}