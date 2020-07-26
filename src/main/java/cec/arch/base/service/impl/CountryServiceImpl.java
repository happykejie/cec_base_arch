package cec.arch.base.service.impl;

import cec.arch.base.model.Country;
import cec.arch.base.mapper.CountryMapper;
import cec.arch.base.service.ICountryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 国家信息 服务实现类
 * </p>
 *
 * @author zj
 * @since 2020-07-21
 */
@Service
public class CountryServiceImpl extends ServiceImpl<CountryMapper, Country> implements ICountryService {
    @Resource
    private CountryMapper countryMapper;

    @Override
    public List<Country> findAllCountry() {
        return countryMapper.findAllCountry();
    }
}
