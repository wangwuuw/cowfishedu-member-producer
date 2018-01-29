package com.cowfishedu.service.impl;


import com.cowfishedu.service.UserService;

/**
 * @classDesc： 功能描述：（）
 * @author：王武
 * @createTime 2018/1/29
 * @verson: v1.0
 * @copyright: 上海江豚教育科技有限公司
 */
public class UserServiceImpl implements UserService {

    public String getUserId(Integer id) {
        System.out.println("端口29014服务被客户端(消费者)消费....id:" + id);
        if (id == 1) {
            return "王武";
        }
        if (id == 2) {
            return "扎克伯格";
        }
        if (id == 1) {
            return "码云";
        }
        return "未找到...";
    }
}
