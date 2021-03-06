package com.shfc.user.httpbean.req;

import com.shfc.user.base.BaseReqBean;

/**
 * Copyright:Copyright (c) 2017
 * Company:东方金融-上海房产
 *
 * @author ljgllxyz
 * @version V1.0
 * @date 2017/1/10 上午9:18.
 */
public class ReqBean60105 extends BaseReqBean {
    private String agreementId;//协议id
    private String email;//电子邮件地址

    public String getAgreementId() {
        return agreementId;
    }

    public void setAgreementId(String agreementId) {
        this.agreementId = agreementId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
