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
@RequestMapping("/ux")

public class UxController {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @GetMapping("silent")
    @ResponseBody
    public List<Map<String,Object>> silent() {
        String sql = "SELECT * FROM ads_silent_count order by curdate";

        List<Map<String,Object>> silentResults = jdbcTemplate.queryForList(sql);

        return silentResults;
    }

    @GetMapping("retention")
    @ResponseBody
    public List<Map<String,Object>> retention() {
        String sql = "SELECT * FROM ads_retention_rate ORDER BY today";

        List<Map<String,Object>> retentionResults = jdbcTemplate.queryForList(sql);

        return retentionResults;
    }
}
