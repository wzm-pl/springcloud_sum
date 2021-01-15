package com.jk.controller;

import com.jk.model.PeriodicalBean;
import com.jk.model.PeriodsBean;
import com.jk.model.TreeBean;
import com.jk.service.PerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
public class PeriodicalController {

    @Autowired
    private PerService perService;

    /**
     * 树
     * @return
     */
    @PostMapping("findNavTree")
    @ResponseBody
    public List<TreeBean> findNavTree(){
        return perService.findNavTree();
    }

    /**
     * 期刊列表
     */
    @GetMapping("periodical")
    @ResponseBody
    public Map findPeriodicalList(Integer page, Integer rows, PeriodicalBean periodicalBean){
        return perService.findPeriodicalList(page,rows,periodicalBean);
    }

    @PutMapping("periodical")
    @ResponseBody
    public void updatePeriodical(PeriodicalBean periodicalBean){
        perService.updatePeriodical(periodicalBean);
    }

    /**
     * 期刊回显
     * @param id
     * @return
     */
    @GetMapping("periodical/{id}")
    @ResponseBody
    public PeriodicalBean findPeriodicalInfoById(@PathVariable("id") Integer id){
        return perService.findPeriodicalInfoById(id);
    }

    /**
     * 根据期刊id查询期数
     * @param page
     * @param rows
     * @param periodsBean
     * @param id
     * @return
     */
    @GetMapping("periods/{id}")
    @ResponseBody
    public Map findPeriodsList(Integer page, Integer rows, PeriodsBean periodsBean,@PathVariable("id") String id){
        return perService.findPeriodsList(page,rows,periodsBean,id);
    }
}
