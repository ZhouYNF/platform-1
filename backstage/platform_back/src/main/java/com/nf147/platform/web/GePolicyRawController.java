package com.nf147.platform.web;

import com.nf147.platform.entity.GePolicyRaw;
import com.nf147.platform.service.GePolicyRawService;
import com.nf147.platform.toolClass.ResultVo;
import org.mybatis.spring.MyBatisSystemException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 张东明
 * @info 原始政策表控制层
 * @date 日期2019/2/20
 */
@RestController
public class GePolicyRawController {

    @Autowired
    private GePolicyRawService gePolicyRawService;

    /**
     * @info /policy/raw/getByPager/{parameter}根据页码查询原始政策信息
     */
    @GetMapping("/policy/raw/getByPager/{start}/{number}")
    public ResultVo getByPolicyRawPager(@PathVariable("start") int start, @PathVariable("number") int number) {
        try {
            if (start > 0 && number >= 0) {
                List<GePolicyRaw> gePolicyRaws = gePolicyRawService.selectByRamPager(start, number);
                return new ResultVo(200, gePolicyRaws);
            } else {
                return new ResultVo(202, "供处理的请求已被接受，但是处理未完成。查询出错！");
            }
        } catch (MyBatisSystemException ex) {
            return new ResultVo(500, "请求未完成。数据库连接出错。",
                    null, ex.getMessage(), null);
        } catch (Exception ex) {
            return new ResultVo(501, "请求未完成。服务器不支持所请求的功能。",
                    null, ex.getMessage(), null);
        }
    }

    /**
     * @info /policy/raw/updateStatus/{parameter}修改原始政策信息
     */
    @GetMapping("/policy/raw/updateStatus/{status}")
    public ResultVo updateByRamStatus(@PathVariable("status") int status) {
        try {
            if (status != 0) {
                int i = gePolicyRawService.updateByRamStatus(status);
                if (i > 0) {
                    return new ResultVo(200, "succeed");
                }
            }
        } catch (MyBatisSystemException ex) {
            return new ResultVo(500, "请求未完成。服务器遇到不可预知的情况。",
                    null, ex.getMessage(), null);
        } catch (Exception ex) {
            return new ResultVo(501, "请求未完成。数据库连接出错。",
                    null, ex.getMessage(), null);
        }
        return new ResultVo(202, "供处理的请求已被接受，但是处理未完成。");
    }
}
