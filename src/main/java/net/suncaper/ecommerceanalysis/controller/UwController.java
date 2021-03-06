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


    @GetMapping("month")
    @ResponseBody
    public List<Map<String, Object>> listUwMonth() {
        String sql = "SELECT COUNT(user_id) AS total, month FROM new_user_in_month GROUP BY month";

        List<Map<String, Object>> uwMonthResults = jdbcTemplate.queryForList(sql);

        return uwMonthResults;
    }

    @GetMapping("week")
    @ResponseBody
    public List<Map<String, Object>> ListUwWeek() {
        String sql = "SELECT COUNT(user_id) AS total, week_num FROM new_user_in_week GROUP BY week_num ORDER BY week_num ASC";

        List<Map<String, Object>> uwWeekResults = jdbcTemplate.queryForList(sql);

        return uwWeekResults;

    }
    @GetMapping("day")
    @ResponseBody
    public List<Map<String,Object>> listUwDay(){
        String sql = "SELECT COUNT(user_id) AS totals, dt FROM new_user_in_day GROUP BY dt";

        List<Map<String,Object>> uwDayResults = jdbcTemplate.queryForList(sql);

        return uwDayResults;
    }


}
