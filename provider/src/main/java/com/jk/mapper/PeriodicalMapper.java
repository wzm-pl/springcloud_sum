package com.jk.mapper;

import com.jk.model.PeriodicalBean;
import com.jk.model.TreeBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

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

//    @Select("SELECT * FROM t_periodical , t_press WHERE #{id} = qkid LIMIT 1 ")
    @Select("select * from t_periodical where periodicalId = #{id}")
    PeriodicalBean findPeriodicalInfoById(Integer id);

    @Update("update t_periodical set periodicalName = #{periodicalName},periodicalCode = #{periodicalCode},periodicalStatus = #{periodicalStatus},launchDate = #{launchDate},tagName = #{tagName},copyright = #{copyright},price = #{price},readPages = #{readPages} where periodicalId = #{periodicalId}")
    void updatePeriodical(PeriodicalBean periodicalBean);
}
