package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.entity.Special;
import com.scs.soft.zhihu.api.mapper.SpecialMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @Auther: Jack
 * @Date: 2020/1/16 10:38
 * @Description:
 */
@Service
public class SpecialServiceImpl  implements  SpecialService{
    @Resource
    private SpecialMapper specialMapper;

    @Override
    public List<Map> selectAll() {
        return specialMapper.selectAll();
    }

    @Override
    public List<Special> selectRecent() {
        return specialMapper.selectRecent();
    }
}
