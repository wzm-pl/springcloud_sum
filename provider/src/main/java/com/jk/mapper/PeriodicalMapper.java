package com.jk.mapper;

import com.jk.model.PeriodicalBean;
import com.jk.model.TreeBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface PeriodicalMapper {
    int queryCount(Map<String, Object> params);

    List<PeriodicalBean> findPeriodicalList(Map<String, Object> params);

    @Select("select * from t_tree where pid = #{value}")
    List<TreeBean> findNavNode(Integer id);

    int queryPeriodsCount(Map<String, Object> params);

    List<PeriodicalBean> findPeriodsList(Map<String, Object> params);
}
