package com.jk.service;

import com.jk.model.PeriodicalBean;
import com.jk.model.PeriodsBean;
import com.jk.model.TreeBean;

import java.util.List;
import java.util.Map;

public interface PeriodicalService {
    Map findPeriodicalList(Integer page, Integer rows, PeriodicalBean periodicalBean);

    List<TreeBean> findNavTree();

    Map findPeriodsList(Integer page, Integer rows, PeriodsBean periodsBean,String id);
}
