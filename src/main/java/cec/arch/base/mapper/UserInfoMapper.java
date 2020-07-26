package cec.arch.base.mapper;

import cec.arch.base.model.UserInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 用户信息表 Mapper 接口
 * </p>
 *
 * @author zj
 * @since 2020-07-19
 */
public interface UserInfoMapper extends BaseMapper<UserInfo> {

    public List<UserInfo> findAllUser();

}
