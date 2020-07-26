package cec.arch.base.controller;


import cec.arch.base.dto.request.UserInfoReqDTO;
import cec.arch.base.service.IUserInfoService;
import cec.arch.base.model.UserInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 用户信息表 前端控制器
 * </p>
 *
 * @author zj
 * @since 2020-07-19
 */
@RestController
@RequestMapping("/user-info")
public class UserInfoController {


    @Autowired
    private IUserInfoService userService;

    /**
     * 查询所有
     * @return
     */
    @GetMapping("/findAllUser")
    public List<UserInfo> findAllUser(){
        return userService.findAllUser();
    }


    /**
     * 单个查询
     * @param id
     * @return
     */
    @GetMapping("/getUser/{id}")
    public UserInfo getUser(@PathVariable Integer id){
        return userService.getById(id);
    }

    @PostMapping("/add")
    public Boolean addUser(@RequestBody UserInfoReqDTO userInfoReqDTO){
        UserInfo userInfo = new UserInfo();
        BeanUtils.copyProperties(userInfoReqDTO, userInfo);
        return userService.save(userInfo);
    }

    @PostMapping("/update")
    public Boolean updateUser(@RequestBody UserInfoReqDTO userInfoReqDTO){
        UserInfo userInfo = new UserInfo();
        BeanUtils.copyProperties(userInfoReqDTO, userInfo);
        return userService.updateById(userInfo);
    }

    @DeleteMapping("/del/{id}")
    public Boolean updateUser(@PathVariable Integer id){
        return userService.removeById(id);
    }
}
