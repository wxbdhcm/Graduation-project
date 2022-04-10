package pers.movie_website.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.movie_website.pojo.User;
import pers.movie_website.pojo.case_all;
import pers.movie_website.pojo.commodity;
import pers.movie_website.service.UserService;

import javax.annotation.Resource;
import java.util.List;


/**
 * @author 18028
 */
@RestController
public class LoginController {
    @Resource
    private UserService userService;



//    @PostMapping("/upUserImg")
//    public Result upUserImg(){
//        return result;
//    }

    /**
     * 用户登录
     *
     * @param user
     * @param pass
     * @return
     */
    @GetMapping("/user")
    public List<User> userLogin() {
        return userService.userLogin();
    }
    @GetMapping("/case")
    public List<case_all> findCase(){
        return userService.findCaseAll();
    }
    @GetMapping("/commodity")
    public List<commodity> findCommodity(){
        return userService.findAllCommidity();
    }

//    //注册
//    @PostMapping("/user/userRegister")
//    public HttpResult userRegister(String user, String pass) {
//        return userService.registerUser(user, pass);
//    }
//
//    //管理员登录
//    @PostMapping("/admin/adminUserLogin")
//    public HttpResult adminUserLogin(String user, String pass) {
//        return userService.userLogin(user, pass,1);
//    }
//
//
//    //用户信息
//    @GetMapping("/api/upUserInfo")
//    public HttpResult upUserInfo(@RequestHeader("Authorization") String token) {
//        return userService.userInfo(token);
//    }
//
//    @PostMapping("/api/grabMovie")
//    public HttpResult grabMovie() {
//        return userService.toGrab();
//    }
//
//    @PostMapping("/api/upLoadCsvFile")
//    public HttpResult upLoadCsvFile(@RequestParam MultipartFile file){
//        File csvFile = CsvImportUtil.uploadFile(file);
//        List<String[]> lists = CsvImportUtil.readCSV(csvFile.getPath(),10);
//        csvFile.delete();
//        return userService.csvInput(lists);
//    }
//    @GetMapping("/admin/upMovieNum")
//    public HttpResult upMovieNum(){
//        return userService.upMovieNum();
//    }


}
