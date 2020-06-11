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
@RequestMapping("/uy")
public class UyController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("funnel")
    @ResponseBody
    public List<Map<String,Object>> funnel() {
        String sql = "SELECT * FROM loudou_analysis ORDER BY total DESC";

        List<Map<String,Object>> funnelResults = jdbcTemplate.queryForList(sql);

        return funnelResults;
    }
}
