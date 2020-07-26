package cec.arch.base.service;

import cec.arch.base.model.UserInfo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 用户信息表 服务类
 * </p>
 *
 * @author zj
 * @since 2020-07-19
 */
public interface IUserInfoService extends IService<UserInfo> {

    public List<UserInfo> findAllUser();

}
