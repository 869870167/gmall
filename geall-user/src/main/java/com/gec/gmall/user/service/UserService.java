package com.gec.gmall.user.service;

import com.gec.gmall.user.bean.UmsMember;

import java.util.List;

public interface UserService {

    List<UmsMember> selectAllUser();
}