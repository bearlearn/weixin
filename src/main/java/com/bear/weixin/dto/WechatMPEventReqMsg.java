package com.bear.weixin.dto;

import javax.validation.constraints.NotBlank;

public class WechatMPEventReqMsg extends  WechatMPReqMsg{

    @NotBlank
    public String getEvent() {
        return this.getString("Event");
    }
}
