package cec.arch.base.controller;


import cec.arch.base.model.Country;
import cec.arch.base.service.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 国家信息 前端控制器
 * </p>
 *
 * @author zj
 * @since 2020-07-21
 */
@RestController
@RequestMapping("/country")
public class CountryController {

    @Autowired
    private ICountryService countryService;

    /**
     * 查询所有
     * @return
     */
    @GetMapping("/findAllCountry")
    public List<Country> findAllCountry (){
        return countryService.findAllCountry();
    }

}
