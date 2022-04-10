package pers.movie_website.mapper;

import pers.movie_website.pojo.User;
import pers.movie_website.pojo.case_all;
import pers.movie_website.pojo.commodity;

import java.util.List;

/**
 * @author 18028
 * 数据库查询操作
 */
//@Mapper
public interface UserMapper {
    /**
     * 是否存在用户
     *
     * @return
     */
    List<User> selectUser();

    List<case_all> selectCase();

    List<commodity> selectCommodity();
//
//    //注册用户
//    Integer insertUser(User user);
//
//    //注册时候查找是否有此用户
//    User existsUser(User user);
//
//    //抓取小说写入数据库
//    Integer inserMovie(Movie movie);
//
//    Integer selectMovieNum();
}
