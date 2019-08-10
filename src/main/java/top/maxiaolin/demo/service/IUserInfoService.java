package top.maxiaolin.demo.service;

import top.maxiaolin.demo.domain.UserInfo;

public interface IUserInfoService {
    /**
     * 通过电话号码查询用户
     * @param phone
     * @return
     */
    UserInfo getOne(String phone);
}
