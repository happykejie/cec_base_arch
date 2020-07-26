package cec.arch.base.service;

import cec.arch.base.model.Country;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 国家信息 服务类
 * </p>
 *
 * @author zj
 * @since 2020-07-21
 */
public interface ICountryService extends IService<Country> {
    public List<Country> findAllCountry();
}
