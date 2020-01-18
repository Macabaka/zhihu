package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.entity.RoundTable;
import com.scs.soft.zhihu.api.mapper.RoundTableMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: Jack
 * @Date: 2020/1/18 11:55
 * @Description:
 */
@Service
public class RoundTableImpl implements  RoundTableService{
    @Resource
    private RoundTableMapper roundTableMapper;

    @Override
    public List<RoundTable> getAllRoundTable() {
        return roundTableMapper.getAllRoundTable();
    }

    @Override
    public List<RoundTable> getRoundTable() {
        return roundTableMapper.getRoundTable();
    }
}
