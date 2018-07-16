
package com.itmayiedu.contoller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * @classDesc: 功能描述:(拦截异常)
 * @author: 余胜军
 * @createTime: 2017年9月16日 下午9:21:32
 * @version: v1.0
 * @copyright:上海每特教育科技有限公司
 * @QQ:644064779
 */
@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(RuntimeException.class)
	@ResponseBody // 拦截返回是 json返回结果
	public Map<String, Object> exceptionHandler() {
		Map<String, Object> result=new HashMap<String, Object>();
		result.put("code","500");
		result.put("msg","亲,系统错误,请稍后重试....");
		return result;
	}

}
