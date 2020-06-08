package net.suncaper.ecommerceanalysis.controller;

import net.suncaper.ecommerceanalysis.domain.UvDetailDay;
import net.suncaper.ecommerceanalysis.domain.UvDetailMonth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/uw")
public class UwController {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @GetMapping("day")
    @ResponseBody
    public List<Map<String,Object>> listUwDay(){
        String sql = "SELECT COUNT(user_id) AS totals, dt FROM new_user_in_day GROUP BY dt";

        List<Map<String,Object>> uwDayResults = jdbcTemplate.queryForList(sql);

        return uwDayResults;
    }

}
