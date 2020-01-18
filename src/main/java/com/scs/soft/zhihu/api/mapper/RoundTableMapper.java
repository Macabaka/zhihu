package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.entity.RoundTable;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface RoundTableMapper {
    /**
     * 查询所有圆桌讨论
     * @return
     */
    @Select(" SELECT * FROM t_round_table ")
    List<RoundTable> getAllRoundTable();

    /**
     * 查询前4个圆桌讨论
     */
    @Select(" SELECT * FROM t_round_table ORDER BY visits_count DESC LIMIT 0,4 ")
    List<RoundTable> getRoundTable();
}
