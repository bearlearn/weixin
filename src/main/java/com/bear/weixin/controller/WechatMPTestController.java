package com.bear.weixin.controller;

import com.bear.weixin.dto.TextResMsg;
import com.bear.weixin.dto.WechatMPReqMsg;
import com.bear.weixin.dto.WechatMPResMsg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/wechatmptest")
@EnableAutoConfiguration
public class WechatMPTestController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private Integer count = 0;

    @GetMapping("/receive")
    public String receive(@RequestParam(required = false) String signature,
                          @RequestParam(required = false) Integer timestamp,
                          @RequestParam(required = false) String nonce,
                          @RequestParam String echostr){
        logger.info("GET Request!!!");
        logger.info("signature: {}", signature);
        logger.info("timestamp: {}", timestamp);
        logger.info("nonce: {}", nonce);
        logger.info("echostr: {}", echostr);
        //todo verify with token
        return echostr;
    }

    @PostMapping(value = "/receive", produces = MediaType.APPLICATION_XML_VALUE)
    public WechatMPResMsg receive(@RequestParam(required = false) String signature,
                                  @RequestParam(required = false) Integer timestamp,
                                  @RequestParam(required = false) String nonce,
                                  @RequestBody(required = false) WechatMPReqMsg reqMsg){
        logger.info("POST Request!!!");
        logger.info("signature: {}", signature);
        logger.info("timestamp: {}", timestamp);
        logger.info("nonce: {}", nonce);
        logger.info("reqMsg: {}", reqMsg);

        //todo verify with token

        count++;
        TextResMsg textResMsg = new TextResMsg("oXMH21DmAMWtXMzDNr92ANW2nx7g",count.toString());
        return textResMsg;
    }
}
