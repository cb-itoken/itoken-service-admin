package com.cb.itoken.service.admin.controller;

import com.cb.itoken.common.domain.TbSysUser;
import com.cb.itoken.common.dto.BaseResult;
import com.cb.itoken.service.admin.service.AdminService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "v1/admins")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "page/{pageNum}/{pageSize}", method = RequestMethod.GET)
    public BaseResult page(
            @PathVariable(required = true) int pageNum,
            @PathVariable(required = true) int pageSize,
            @RequestParam(required = false)TbSysUser tbSysUser
            ){
        PageInfo<TbSysUser> pageInfo = adminService.page(pageNum, pageSize, tbSysUser);

        // 分页后的结果集
        List<TbSysUser> list = pageInfo.getList();

        // 封装 Cursor 对象
        BaseResult.Cursor cursor = new BaseResult.Cursor();
        cursor.setTotal(new Long(pageInfo.getTotal()).intValue());
        cursor.setOffset(pageInfo.getPageNum());
        cursor.setLimit(pageInfo.getPageSize());

      return BaseResult.ok(list, cursor);
    }
}
