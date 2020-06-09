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
@RequestMapping("/ul")
public class UlController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("primaryData")
    @ResponseBody
    public List<Map<String, Object>> listPrimaryData() {
        String listPrimaryDataSql = "SELECT * FROM primarydata_analysis";

        List<Map<String, Object>> ulPrimaryDataResults = jdbcTemplate.queryForList(listPrimaryDataSql);

        String Day11Sql = "SELECT COUNT(*) AS day11Trad  FROM day11";

        List<Map<String, Object>> Day11 = jdbcTemplate.queryForList(Day11Sql);

        ulPrimaryDataResults.addAll(Day11);

        return ulPrimaryDataResults;
    }

    @GetMapping("city")
    @ResponseBody
    public List<Map<String, Object>> listCity() {
        String sql = "SELECT * from consume_ability";

        List<Map<String, Object>> cityResults = jdbcTemplate.queryForList(sql);

        return cityResults;
    }

    @GetMapping("male_female")
    @ResponseBody
    public List<Map<String, Object>> listMale_Female() {
        String sql = "SELECT * FROM male_female";

        List<Map<String, Object>> results = jdbcTemplate.queryForList(sql);

        return results;
    }
}
