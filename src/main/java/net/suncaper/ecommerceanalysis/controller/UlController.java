package net.suncaper.ecommerceanalysis.controller;

import net.suncaper.ecommerceanalysis.domain.UserLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("ul")
public class UlController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("totaluser")
    @ResponseBody
    public List<Map<String, Object>> listTotalUser() {
        String sql = "SELECT COUNT(DISTINCT user_id) FROM user_log";

        List<Map<String, Object>> ulTotalUserResults = jdbcTemplate.queryForList(sql);

        return ulTotalUserResults;
    }

    @GetMapping("totalstore")
    @ResponseBody
    public List<Map<String, Object>> listTotalStore() {
        String sql = "SELECT COUNT(DISTINCT merchant_id) FROM user_log";

        List<Map<String, Object>> ulTotalStroreResults = jdbcTemplate.queryForList(sql);

        return ulTotalStroreResults;
    }

    @GetMapping("totalbrand")
    @ResponseBody
    public List<Map<String, Object>> listTotalBrand() {
        String sql = "SELECT COUNT(DISTINCT brand_id) FROM user_log";

        List<Map<String, Object>> ulTotalBrandResults = jdbcTemplate.queryForList(sql);

        return ulTotalBrandResults;
    }

    @GetMapping("totaldeal")
    @ResponseBody
    public List<Map<String, Object>> listTotalDeal() {
        String sql = "SELECT COUNT(*) FROM user_log WHERE action=2";

        List<Map<String, Object>> ulTotalDealResults = jdbcTemplate.queryForList(sql);

        return ulTotalDealResults;
    }

    @GetMapping("totaldoubleeleven")
    @ResponseBody
    public List<Map<String, Object>> listTotalDoubleEleven() {
        String sql = "SELECT COUNT(*) FROM user_log WHERE month='11' AND day='11'";

        List<Map<String, Object>> ulTotalDoubleElevenResults = jdbcTemplate.queryForList(sql);

        return ulTotalDoubleElevenResults;
    }

    @GetMapping("totalmale")
    @ResponseBody
    public List<Map<String, Object>> listTotalmale() {
        String sql = "SELECT COUNT(*) FROM user_log where gender=2 AND action =2";

        List<Map<String, Object>> ulTotalMaleResults = jdbcTemplate.queryForList(sql);

        return ulTotalMaleResults;
    }

    @GetMapping("totalfemale")
    @ResponseBody
    public List<Map<String, Object>> listTotalfemale() {
        String sql = "SELECT COUNT(*) FROM user_log where gender=1 AND action =2";

        List<Map<String, Object>> ulTotalFemaleResults = jdbcTemplate.queryForList(sql);

        return ulTotalFemaleResults;
    }
}
