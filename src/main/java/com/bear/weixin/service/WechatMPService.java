package com.bear.weixin.service;

import com.alibaba.fastjson.JSONObject;

public interface WechatMPService {

    String getAccessToken();

    JSONObject getUserAccessToken(String code);

}
