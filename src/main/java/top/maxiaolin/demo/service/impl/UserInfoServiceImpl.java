package top.maxiaolin.demo.service.impl;

import org.springframework.stereotype.Service;
import top.maxiaolin.demo.domain.UserInfo;
import top.maxiaolin.demo.persistence.UserInfoRepository;
import top.maxiaolin.demo.service.IUserInfoService;

import javax.annotation.Resource;

@Service
public class UserInfoServiceImpl implements IUserInfoService {
    @Resource
    private UserInfoRepository userInfoRepository;
    @Override
    public UserInfo getOne(String phone) {
        return userInfoRepository.getByPhone(phone);
    }
}
