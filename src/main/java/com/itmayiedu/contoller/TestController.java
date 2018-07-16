
package com.itmayiedu.contoller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @classDesc: 功能描述:(第一个springboot)
 * @author: 余胜军
 * @createTime: 2017年9月16日 下午8:32:02
 * @version: v1.0
 * @copyright:上海每特教育科技有限公司
 * @QQ:644064779
 */
@RestController
//@EnableAutoConfiguration
public class TestController {

	/**
	 * 
	 * @methodDesc: 功能描述:(@RestController)
	 * @author: 余胜军
	 * @param: @return
	 * @createTime:2017年9月16日 下午8:33:20
	 * @returnType:@return String
	 * @copyright:上海每特教育科技有限公司
	 * @QQ:644064779
	 */
	@RequestMapping("/hello")
	public String hello() {
		return "success";
	}

//	public static void main(String[] args) {
//        //运行
//		SpringApplication.run(TestController.class, args);
//	}

}
