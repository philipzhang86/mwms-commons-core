package com.jmalltech.security.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jmalltech.security.entity.Staff;
import org.apache.ibatis.annotations.Param;

/**
* @author philipzhang
* @description 针对表【mwms_staff】的数据库操作Mapper
* @createDate 2024-03-26 14:02:05
* @Entity com.jmalltech.entity.Staff
*/
public interface StaffMapper extends BaseMapper<Staff> {
    Staff getByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
}




