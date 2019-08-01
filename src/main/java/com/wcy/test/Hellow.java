
package com.wcy.test;

import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
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
    
    @ResponseBody
    @RequestMapping("hellow3")
    public String hellow3(@PathParam(value="name") String name){
        
        System.out.println("hellow3");
        return "hellow3:"+ name;
    }
    
    @ResponseBody
    @RequestMapping("{name}")
    public String hellow4(@PathVariable String name){
        System.out.println("hellow4");
        return "hellow4:"+ name;
    }
}

