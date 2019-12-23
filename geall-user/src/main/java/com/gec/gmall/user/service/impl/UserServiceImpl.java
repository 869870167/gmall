package com.gec.gmall.user.service.impl;

import com.gec.gmall.user.bean.UmsMember;
import com.gec.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.gec.gmall.user.mapper.UserMapper;
import com.gec.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> selectAllUser() {

        return userMapper.selectAllUser();
    }
}
