package com.bear.weixin.service;

import com.bear.weixin.exception.ClientException;
import com.bear.weixin.po.User;
import com.bear.weixin.po.UserDetail;
import com.bear.weixin.vo.Position;

public interface UserService {

    void create(User user, UserDetail userDetail);

    void delete(String openid);

    void savePosition(String openId, Position position);

    Position loadPosition(String openid);

    void checkIn(String openid) throws ClientException;

    void checkOut(String openid) throws ClientException, ClientException;

    User getUserFromWechatMP(String openId) throws ClientException;
}
