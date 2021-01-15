package com.jk.service;

import com.jk.hystrix.PerServiceHystrix;
import com.jk.model.PeriodicalBean;
import com.jk.model.PeriodsBean;
import com.jk.model.TreeBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@FeignClient(value = "provider",fallback = PerServiceHystrix.class)
public interface PerService {

    @GetMapping("findPeriodsList")
    Map findPeriodsList(@RequestParam Integer page, @RequestParam Integer rows, @SpringQueryMap PeriodsBean periodsBean, @RequestParam String id);

    @GetMapping("periodical")
    Map findPeriodicalList(@RequestParam Integer page,@RequestParam Integer rows,@SpringQueryMap PeriodicalBean periodicalBean);

    @PostMapping("findNavTree")
    List<TreeBean> findNavTree();

    @GetMapping("findPeriodicalInfoById")
    PeriodicalBean findPeriodicalInfoById(@RequestParam Integer id);

    @PutMapping("updatePeriodical")
    void updatePeriodical(PeriodicalBean periodicalBean);
}
