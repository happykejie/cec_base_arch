package cec.arch.base.service.impl;

import cec.arch.base.model.City;
import cec.arch.base.mapper.CityMapper;
import cec.arch.base.service.ICityService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 市级信息 服务实现类
 * </p>
 *
 * @author zj
 * @since 2020-07-19
 */
@Service
public class CityServiceImpl extends ServiceImpl<CityMapper, City> implements ICityService {

}
