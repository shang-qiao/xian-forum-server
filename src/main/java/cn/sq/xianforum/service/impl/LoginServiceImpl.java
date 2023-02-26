package cn.sq.xianforum.service.impl;

import cn.sq.xianforum.service.LoginService;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Override
    public String getUsername(String s) {
        return s;
    }
}
