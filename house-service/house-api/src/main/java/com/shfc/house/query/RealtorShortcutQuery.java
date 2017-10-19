package com.shfc.house.query;

import java.io.Serializable;

/**
 * @Package com.shfc.house.query.RealtorShortcutQuery
 * @Description: 经纪人快捷登录
 * @Company:上海房产
 * @Copyright: Copyright (c) 2016
 * Author xiehaibin
 * @date 2017/1/8 11:43
 * version V1.0.0
 */
public class RealtorShortcutQuery implements Serializable {
    private String phone;//手机号
    private String checkCode;//验证码
    private String msgId;//消息id
    private String deviceId;//设备ID
    private Integer osType;//操作系统类型0-iOS 1-Android
    private int source;//帐号来源(1-经纪人App，2-经纪人App（997），3-经纪合作平台，4-运营后台(997),5-开年红包微信公众

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCheckCode() {
        return checkCode;
    }

    public void setCheckCode(String checkCode) {
        this.checkCode = checkCode;
    }

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
    }

    public Integer getOsType() {
        return osType;
    }

    public void setOsType(Integer osType) {
        this.osType = osType;
    }
}
