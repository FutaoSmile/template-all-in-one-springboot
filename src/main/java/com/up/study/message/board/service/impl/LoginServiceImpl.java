package com.up.study.message.board.service.impl;

import com.up.study.message.board.framework.login.service.LoginService;
import com.up.study.message.board.framework.user.BasicUser;
import org.springframework.stereotype.Service;

/**
 * @author fish_temp_author
 * @since fish_temp_since
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Override
    public BasicUser loginByUsernamePassword(String username, String password) {
        return null;
    }
}
