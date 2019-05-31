package com.bear.weixin.controller;

import com.bear.weixin.exception.ClientException;
import com.bear.weixin.po.User;
import com.bear.weixin.service.UserService;
import com.bear.weixin.service.WechatMPService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/temp")
@EnableAutoConfiguration
public class TempController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private WechatMPService wechatMPService;

    @Autowired
    private UserService userService;

    @GetMapping("/test")
    public String test() throws ClientException {
//        String accessToken = wechatMPService.getAccessToken();
        User user = userService.getUserFromWechatMP("oXMH21DmAMWtXMzDNr92ANW2nx7g");
        return "temptest";
    }
}
