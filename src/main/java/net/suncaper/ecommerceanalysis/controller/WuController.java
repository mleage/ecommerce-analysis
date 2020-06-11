package net.suncaper.ecommerceanalysis.controller;

import net.suncaper.ecommerceanalysis.domain.WasteUserDay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/wu")
public class WuController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("day")
    @ResponseBody
    public List<Map<String,Object>> listWuDay(){
        String sql = "SELECT wastage_count AS totals, dt FROM ads_waste_user_count ORDER BY dt";

        List<Map<String,Object>> wuDayResults = jdbcTemplate.queryForList(sql);

        return wuDayResults;
    }
}
