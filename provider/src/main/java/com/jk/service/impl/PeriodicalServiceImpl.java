package com.jk.service.impl;

import com.jk.mapper.PeriodicalMapper;
import com.jk.model.PeriodicalBean;
import com.jk.model.PeriodsBean;
import com.jk.model.TreeBean;
import com.jk.service.PeriodicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PeriodicalServiceImpl implements PeriodicalService {

    @Autowired
    private PeriodicalMapper periodicalMapper;

    @Override
    public Map findPeriodicalList(Integer page, Integer rows, PeriodicalBean periodicalBean) {
        Map<String, Object> result = new HashMap<>();
        Map<String, Object> params = new HashMap<>();
        params.put("periodicalBean",periodicalBean);
        int count = periodicalMapper.queryCount(params);
        params.put("start",(page-1)*rows);
        params.put("end",rows);
        List<PeriodicalBean> list = periodicalMapper.findPeriodicalList(params);
        result.put("total",count);
        result.put("rows",list);
        return result;
    }

    @Override
    public List<TreeBean> findNavTree() {
        Integer id = 0;
        return findNodes(id);
    }

    @Override
    public Map findPeriodsList(Integer page, Integer rows, PeriodsBean periodsBean, String id) {
        Map<String, Object> result = new HashMap<>();
        Map<String, Object> params = new HashMap<>();
        params.put("periodsBean",periodsBean);
        params.put("id",id);
        int count = periodicalMapper.queryPeriodsCount(params);
        params.put("start",(page-1)*rows);
        params.put("end",rows);
        List<PeriodicalBean> list = periodicalMapper.findPeriodsList(params);
        result.put("total",count);
        result.put("rows",list);
        return result;
    }

    private List<TreeBean> findNodes(Integer id) {
        List<TreeBean> trees = periodicalMapper.findNavNode(id);
        for (TreeBean treeBean : trees) {
            List<TreeBean> findNodes = findNodes(treeBean.getId());
            if (findNodes != null && findNodes.size() > 0){
                treeBean.setNodes(findNodes);
            }else {
                treeBean.setSelectable(true);
            }
        }
        return trees;
    }
}
