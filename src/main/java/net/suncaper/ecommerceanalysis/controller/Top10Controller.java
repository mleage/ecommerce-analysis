package net.suncaper.ecommerceanalysis.controller;

import net.suncaper.ecommerceanalysis.domain.MerchantTop10;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/top")
public class Top10Controller {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("merchant")
    @ResponseBody
    public List<Map<String, Object>> listMerchantTop() {
        String sql = "SELECT * FROM merchant_top10 ORDER BY total DESC";

        List<Map<String, Object>> merchantTopResults = jdbcTemplate.queryForList(sql);

        return merchantTopResults;
    }

    @GetMapping("brand")
    @ResponseBody
    public List<Map<String,Object>> listUvDay(){
        String sql = "SELECT * FROM brand_top10 ORDER BY total DESC";

        List<Map<String,Object>> brandTopResults = jdbcTemplate.queryForList(sql);

        return brandTopResults;
    }

    @GetMapping("item")
    @ResponseBody
    public List<Map<String,Object>> ListUvWeek(){
        String sql = "SELECT * FROM item_top10 ORDER BY total DESC";

        List<Map<String, Object>> itemTopResults = jdbcTemplate.queryForList(sql);

        return itemTopResults;
    }

}