package com.jk.controller;

import com.jk.model.PeriodicalBean;
import com.jk.model.PeriodsBean;
import com.jk.model.TreeBean;
import com.jk.service.PerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @GetMapping("periods")
    @ResponseBody
    public Map findPeriodsList(Integer page, Integer rows, PeriodsBean periodsBean,String id){
        return perService.findPeriodsList(page,rows,periodsBean,id);
    }
}
