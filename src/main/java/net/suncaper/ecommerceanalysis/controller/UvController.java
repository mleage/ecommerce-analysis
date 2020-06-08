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
@RequestMapping("/uv")
public class UvController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("month")
    @ResponseBody
    public List<Map<String, Object>> listUvMonth() {
        String sql = "SELECT * FROM dws_uv_detail_month ORDER BY month ASC";

        List<Map<String, Object>> uvMonthResults = jdbcTemplate.queryForList(sql);

        return uvMonthResults;
    }

    @GetMapping("day")
    @ResponseBody
    public List<Map<String,Object>> listUvDay(){
        String sql = "SELECT COUNT(user_id) AS totals, dt FROM dws_uv_detail_day GROUP BY dt";

        List<Map<String,Object>> uvDayResults = jdbcTemplate.queryForList(sql);

        return uvDayResults;
    }

    @GetMapping("user")
    @ResponseBody
    public List<Map<String,Object>> listUserLog(){
        String sql = "SELECT COUNT(*) FROM user_log";

        List<Map<String,Object>> userLogResults = jdbcTemplate.queryForList(sql);

        return userLogResults;
    }
}
