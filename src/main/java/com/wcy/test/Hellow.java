
package com.wcy.test;

import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wencongyan
 * @date 2019年8月1日 上午8:16:54
 * 
 */
@RequestMapping("/test/")
@Controller
public class Hellow {

    @ResponseBody
    @RequestMapping("hellow")
    public String hellow(){
        return "hellow";
    }
    
    @ResponseBody
    @RequestMapping("hellow2")
    public String hellow2(@PathParam(value="name") String name){
        return "hellow2:"+ name;
    }
}

