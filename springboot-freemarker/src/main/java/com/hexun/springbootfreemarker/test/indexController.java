package com.hexun.springbootfreemarker.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class indexController {

    /**
     * 请求地址 : http://localhost/index?code=hexun
     * @param modelMap
     * @param code
     * @return
     */
    @GetMapping("/index")
    public String index(ModelMap modelMap, @RequestParam String code){

        modelMap.put("code",code);
        modelMap.put("name","和讯");

        return "index";
    }
}
