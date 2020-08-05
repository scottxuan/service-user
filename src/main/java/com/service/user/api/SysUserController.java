package com.service.user.api;

import com.module.user.api.SysUserApi;
import com.module.user.entity.SysUser;
import com.scottxuan.web.base.BaseController;
import com.scottxuan.web.result.ResultDto;
import com.service.user.service.SysUserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 系统账户 前端控制器
 * </p>
 *
 * @author scottxuan
 * @since 2020-08-04
 */
@Api(tags = "10000--系统账户")
@RestController
public class SysUserController extends BaseController implements SysUserApi {
    @Autowired
    private SysUserService sysUserService;

    @Override
    public ResultDto<SysUser> findByAccount(String account) {
        return getResultDto(sysUserService.findByAccount(account));
    }
}
