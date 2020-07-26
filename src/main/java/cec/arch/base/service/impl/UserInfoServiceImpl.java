package cec.arch.base.service.impl;

import cec.arch.base.model.UserInfo;
import cec.arch.base.mapper.UserInfoMapper;
import cec.arch.base.service.IUserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author zj
 * @since 2020-07-19
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {

    @Resource
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> findAllUser() {
        return userInfoMapper.findAllUser();
    }
}
