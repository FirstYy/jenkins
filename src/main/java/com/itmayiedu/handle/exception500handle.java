package com.itmayiedu.handle;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class exception500handle {
    /**
     * @return
     */
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Map<String,Object> return500(HttpServletRequest request,HttpServletResponse response)
    {
     Map<String,Object> map = new HashMap<String, Object>();
     map.put("code", 500);
     map.put("errormessage", "by zero");
     return map;
    }
    }
