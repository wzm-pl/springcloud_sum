package com.jk.hystrix;

import com.jk.model.PeriodicalBean;
import com.jk.model.PeriodsBean;
import com.jk.model.TreeBean;
import com.jk.service.PerService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class PerServiceHystrix implements PerService {
    @Override
    public Map findPeriodsList(Integer page, Integer rows, PeriodsBean periodsBean, String id) {
        return null;
    }

    @Override
    public Map findPeriodicalList(Integer page, Integer rows, PeriodicalBean periodicalBean) {
        return null;
    }

    @Override
    public List<TreeBean> findNavTree() {
        return null;
    }
}
