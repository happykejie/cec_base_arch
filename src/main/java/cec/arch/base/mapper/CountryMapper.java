package cec.arch.base.mapper;

import cec.arch.base.model.Country;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 国家信息 Mapper 接口
 * </p>
 *
 * @author zj
 * @since 2020-07-21
 */
public interface CountryMapper extends BaseMapper<Country> {
    public List<Country> findAllCountry();
}
