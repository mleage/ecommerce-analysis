package net.suncaper.ecommerceanalysis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/contuinityWk")
public class ContuinityWkController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("wk")
    @ResponseBody
    public List<Map<String, Object>> listUvMonth() {
        String sql = "SELECT dt, continuity_count FROM ads_continuity_wk_count ORDER BY dt ASC";

        List<Map<String, Object>> contuinityWeekResults = jdbcTemplate.queryForList(sql);

        return contuinityWeekResults;
    }
}
