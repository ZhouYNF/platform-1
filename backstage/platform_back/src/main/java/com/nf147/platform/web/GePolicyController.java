package com.nf147.platform.web;

import com.nf147.platform.entity.GePolicy;
import com.nf147.platform.service.GePolicyService;
import com.nf147.platform.toolClass.ResultVo;
import org.mybatis.spring.MyBatisSystemException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 张东明
 * @info 政策
 * @date 20192/21
 */
@RestController
public class GePolicyController {

    @Autowired
    private GePolicyService gePolicyService;

    /**
     * /policy/insert 向政策结构表插入数据
     */
    @PostMapping("/policy/insert")
    public ResultVo insertDetail(@RequestBody GePolicy gePolicy) {
        try {
            if (gePolicy != null) {
                int result = gePolicyService.insert(gePolicy);
                if (result > 0) {
                    return new ResultVo(200, "succeed");
                }
            }
        } catch (MyBatisSystemException ex) {
            return new ResultVo(500, "请求未完成。数据库连接出错。",
                    null, ex.getMessage(), null);
        } catch (Exception ex) {
            return new ResultVo(501, "请求未完成。服务器不支持所请求的功能。",
                    null, ex.getMessage(), null);
        }
        return new ResultVo(202, "供处理的请求已被接受，但是处理未完成。添加失败！");
    }

}
