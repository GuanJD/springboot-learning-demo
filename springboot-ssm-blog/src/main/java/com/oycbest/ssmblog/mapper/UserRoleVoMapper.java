package com.oycbest.ssmblog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.oycbest.ssmblog.domain.User;
import com.oycbest.ssmblog.vo.UserRolerVo;
import org.apache.ibatis.annotations.Param;

/**
 * (SsmUser)表数据库访问层
 *
 * @author oyc
 * @since 2020-04-28 23:21:52
 */
public interface UserRoleVoMapper extends BaseMapper<UserRolerVo> {

    /**
     * 通过账号查询用户信息
     *
     * @param account 账号
     * @return 对象列表
     */
    UserRolerVo queryByAccount(@Param("account") String account);

}
