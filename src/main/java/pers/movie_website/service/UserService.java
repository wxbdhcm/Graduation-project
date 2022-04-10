package pers.movie_website.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import pers.movie_website.mapper.UserMapper;
import pers.movie_website.pojo.User;
import pers.movie_website.pojo.case_all;
import pers.movie_website.pojo.commodity;
import javax.annotation.Resource;
import java.util.List;


/**
 * @author 18028
 */
@Service
public class UserService {


    @Resource
    private UserMapper userMapper;

    @Resource
    private RedisTemplate redisTemplate;


    private final Logger logger = LoggerFactory.getLogger(UserService.class);

    public List<User> userLogin() {
       return userMapper.selectUser();
    }
    public List<case_all> findCaseAll() {
        return userMapper.selectCase();
    }
    public List<commodity> findAllCommidity() {
        return userMapper.selectCommodity();
    }


}
