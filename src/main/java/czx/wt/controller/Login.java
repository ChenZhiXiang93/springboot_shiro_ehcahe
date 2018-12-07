package czx.wt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ChenZhiXiang
 * @version 1.0.0
 * @Description TODO
 * @createTime 2018年12月06日 21:47:00
 */
@Controller
public class Login {

    @RequestMapping("/login")
    public String demo3(){
        return "login";//地址指向demo3.html
    }
}
