package com.nf147.platform.web;

import com.nf147.platform.entity.GePolicyDetail;
import com.nf147.platform.service.GePolicyDetailService;
import com.nf147.platform.toolClass.ResultVo;
import org.mybatis.spring.MyBatisSystemException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 张东明
 * @info 政策结构化
 * @date 2019/2/21
 */
@RestController
public class GePolicyDetailController {

    @Autowired
    private GePolicyDetailService gePolicyDetailService;

    /**
     * @info /policy/insert 向政策表插入数据
     */
    @PostMapping("/policy/detail/insert")
    public ResultVo insertDetail(@RequestBody GePolicyDetail gePolicyDetail) {
        try {
            if (gePolicyDetail != null) {
                int result = gePolicyDetailService.insert(gePolicyDetail);
                if (result > 0) {
                    return new ResultVo(200, "succeed");
                }
            }
        } catch (MyBatisSystemException ex) {
            return new ResultVo(500, "请求未完成。数据库连接出错。",
                    null, ex.getMessage(), null);
        } catch (Exception ex) {
            return new ResultVo(501, "请求未完成。服务器不支持所请求的功能！", null, ex.getMessage(), null);
        }
        return new ResultVo(202, "供处理的请求已被接受，但是处理未完成。添加失败！");
    }

    /**
     * @info /policy/detail/updateInfo 修改政策结构表的信息
     */
    @PostMapping("/policy/detail/updateInfo")
    public ResultVo updateDetail(@RequestBody GePolicyDetail gePolicyDetail) {
        try {
            if (gePolicyDetail != null) {
                int result = gePolicyDetailService.updateByPrimaryKey(gePolicyDetail);
                if (result > 0) {
                    return new ResultVo(200, "succeed");
                }
            }
        } catch (MyBatisSystemException ex) {
            return new ResultVo(500, "请求未完成。数据库连接出错。",
                    null, ex.getMessage(), null);
        } catch (Exception ex) {
            return new ResultVo(501, "请求未完成。服务器不支持所请求的功能！", null, ex.getMessage(), null);
        }
        return new ResultVo(202, "供处理的请求已被接受，但是处理未完成。修改失败！");
    }

    /**
     * @info /policy/detail/updateStatus 修改政策结构表的状态
     */
    @PostMapping("/policy/detail/updateStatus")
    public ResultVo updateByDetailStatus(@RequestBody GePolicyDetail gePolicyDetail) {
        try {
            if (gePolicyDetail != null) {
                int result = gePolicyDetailService.updateByPrimaryKey(gePolicyDetail);
                if (result > 0) {
                    return new ResultVo(200,"succeed!");
                }
            }
        } catch (MyBatisSystemException ex) {
            return new ResultVo(500, "请求未完成。数据库连接出错。",
                    null, ex.getMessage(), null);
        } catch (Exception ex) {
            return new ResultVo(501, "请求未完成。服务器不支持所请求的功能！", null, ex.getMessage(), null);
        }
        return new ResultVo(202, "供处理的请求已被接受，但是处理未完成。修改失败！");
    }

    /**
     * @info /policy/getByPager/{parameter} 分页查询政策结构表和政策表
     */
    @GetMapping("/policy/Detail/getByPager/{start}/{number}")
    public ResultVo getByPolicyRawPager(@PathVariable("start") int start, @PathVariable("number") int number) {
        try {
            if (start > 0 && number > 0) {
                return new ResultVo(200,
                        gePolicyDetailService.selectByPolicDetail(start, number));
            }
        } catch (MyBatisSystemException ex) {
            return new ResultVo(500, "请求未完成。数据库连接出错。",
                    null, ex.getMessage(), null);
        } catch (Exception ex) {
            return new ResultVo(501, "请求未完成。服务器不支持所请求的功能！", null, ex.getMessage(), null);
        }
        return new ResultVo(202, "供处理的请求已被接受，但是处理未完成。查询出错！");
    }
}
