package com.jk.controller;

import com.jk.model.PeriodicalBean;
import com.jk.model.PeriodsBean;
import com.jk.model.TreeBean;
import com.jk.service.PerService;
import com.jk.service.PeriodicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class PeriodicalController implements PerService {

    @Autowired
    private PeriodicalService periodicalService;

    /**
     * 期数查询
     * @param page
     * @param rows
     * @param periodsBean
     * @param id
     * @return
     */
    @Override
    public Map findPeriodsList(Integer page, Integer rows, PeriodsBean periodsBean, String id) {
        return periodicalService.findPeriodsList(page,rows,periodsBean,id);
    }

    /**
     * 期刊列表
     * @param page
     * @param rows
     * @param periodicalBean
     * @return
     */
    @Override
    public Map findPeriodicalList(Integer page, Integer rows,PeriodicalBean periodicalBean) {
        return periodicalService.findPeriodicalList(page,rows,periodicalBean);
    }

    /**
     * 树
     * @return
     */
    @Override
    public List<TreeBean> findNavTree() {
        return periodicalService.findNavTree();
    }
}
