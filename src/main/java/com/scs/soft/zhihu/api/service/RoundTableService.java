package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.entity.RoundTable;
import org.springframework.stereotype.Service;

import java.util.List;

public interface RoundTableService {
    /**
     * 查询所有圆桌
     * @return
     */
    List<RoundTable> getAllRoundTable();

    /***
     * 查询前4个圆桌
     * @Return
     */
    List<RoundTable> getRoundTable();
}
