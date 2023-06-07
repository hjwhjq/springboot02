package com.example.springboot02.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.springboot02.entity.Admin;
import com.example.springboot02.mapper.AdminMapper;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    AdminMapper adminMapper;

    @GetMapping("/getAdmins")
    public List<Admin> getAdmins(){
        return adminMapper.selectList(null);
    }


    @GetMapping("/adminByName/{username}")
    @Operation(summary = "模糊查询姓名")
    public List<Admin> findByName(@PathVariable String username) {
        QueryWrapper<Admin> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("username", username);
        return adminMapper.selectList(queryWrapper);
    }

    @PostMapping("/creatAdmin")
    public Admin createAdmin(@RequestBody Admin admin) {
        adminMapper.insert(admin);
        return admin;
    }

    @PutMapping("/updateAdmin/{id}")
    public Admin updateAdmin(@PathVariable("id") int id, @RequestBody Admin admin) {
        Admin existingAdmin = adminMapper.selectById(id);
        if (existingAdmin != null) {
            admin.setId(id);
            adminMapper.updateById(admin);
            return admin;
        } else {
            return null;
        }
    }

    @DeleteMapping("/delAdmin/{id}")
    public int delAdmin(@PathVariable("id") int id) {
        return adminMapper.deleteById(id);
    }

    @GetMapping("/findByPage")
    public IPage getAdminList(@RequestParam("pageNum") Integer pageNum,@RequestParam("pageSize") Integer pageSize){
        Page<Admin> page=new Page<>(pageNum,pageSize);
        QueryWrapper<Admin> queryWrapper=new QueryWrapper<>();
        queryWrapper.orderByDesc("id");//根据id字段降序排序
        page.addOrder(OrderItem.desc("id"));//添加降序排序条件
        IPage ipage = adminMapper.selectPage(page,null);
        return ipage;
    }

    /*@PostMapping("/uploadAvatar")
    public String uploadAvatar(@RequestParam("file") MultipartFile file){
        try {
            // 获取文件保存路径
            String filePath = "/path/to/save/avatar.png";

            // 保存文件到服务器上的指定路径
            Path targetLocation = Path.of(filePath);
            Files.copy(file.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);

            // 更新管理员头像地址的代码
            updateAdminAvatarUrl(filePath);

            return "头像上传成功";
        } catch (Exception e) {
            return "头像上传失败：" + e.getMessage();
        }
    }
    private void updateAdminAvatarUrl(String filePath) {
        // 更新管理员表中的头像地址字段
        // 根据你的实际数据访问逻辑进行更新操作

    }*/


}
