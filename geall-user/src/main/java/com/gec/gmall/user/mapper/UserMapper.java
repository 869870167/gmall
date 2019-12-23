package com.gec.gmall.user.mapper;

import com.gec.gmall.user.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
@org.apache.ibatis.annotations.Mapper
public interface UserMapper extends Mapper<UmsMember> {

    List<UmsMember> selectAllUser();
}
