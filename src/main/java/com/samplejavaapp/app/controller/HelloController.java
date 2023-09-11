package com.samplejavaapp.app.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/query")
    @ResponseBody
    public String getQuery(HttpServletRequest request) {
        Map<String, String[]> params = request.getParameterMap();

        if (params.isEmpty()) {
            System.out.println("No parameters in query");
            return "No parameters in query";
        }
        String result = "Query parameters: \n";

        for (String key : params.keySet()) {
            result += key + " = " + params.get(key)[0] + ",\n";
        }

        System.out.println(result);
        return result;
    }
}
