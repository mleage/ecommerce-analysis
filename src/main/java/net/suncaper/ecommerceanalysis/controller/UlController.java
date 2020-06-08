package net.suncaper.ecommerceanalysis.controller;

import net.suncaper.ecommerceanalysis.domain.UserLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/ul")
public class UlController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("total")
    @ResponseBody
    public List<Map<String, Object>> listTotalUser() {
        String sqltotaluser = "SELECT COUNT(DISTINCT user_id) AS value FROM user_log";
        String sqltotalstore = "SELECT COUNT(DISTINCT merchant_id) AS value FROM user_log";
        String sqltotalbrand = "SELECT COUNT(DISTINCT brand_id) AS value FROM user_log";
        String sqltotaldeal = "SELECT COUNT(*) FROM user_log WHERE action=2";
        String sqldoubleeleven = "SELECT COUNT(*) FROM user_log WHERE month='11' AND day='11'";
        String sqltotalmale = "SELECT COUNT(*) FROM user_log where gender=2 AND action =2";
        String sqltotalfemale = "SELECT COUNT(*) FROM user_log where gender=1 AND action =2";


        List<Map<String, Object>> ulTotalResults = jdbcTemplate.queryForList(sqltotaluser);
        ulTotalResults.get(0).put("name", "totaluser");
        ulTotalResults.addAll(jdbcTemplate.queryForList(sqltotalstore));
        ulTotalResults.get(1).put("name", "totalstore");
        ulTotalResults.addAll(jdbcTemplate.queryForList(sqltotalbrand));
        ulTotalResults.get(2).put("name", "totalbrand");
        ulTotalResults.addAll(jdbcTemplate.queryForList(sqltotaldeal));
        ulTotalResults.get(3).put("name", "totaldeal");
        ulTotalResults.addAll(jdbcTemplate.queryForList(sqldoubleeleven));
        ulTotalResults.get(4).put("name", "doubleeleven");
        ulTotalResults.addAll(jdbcTemplate.queryForList(sqltotalmale));
        ulTotalResults.get(5).put("name", "totalmale");
        ulTotalResults.addAll(jdbcTemplate.queryForList(sqltotalfemale));
        ulTotalResults.get(6).put("name", "totalfemale");


        return ulTotalResults;
    }

    @GetMapping("city")
    @ResponseBody
    public List<Map<String, Object>> listCity() {
        String sql = "SELECT province AS name, COUNT(*) AS value FROM user_log WHERE action=2 GROUP BY province ORDER BY value DESC";

        List<Map<String, Object>> cityResults = jdbcTemplate.queryForList(sql);

        return cityResults;
    }
}
