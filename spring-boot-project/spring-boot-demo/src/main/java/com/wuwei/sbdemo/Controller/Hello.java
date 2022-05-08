package com.wuwei.sbdemo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Hello {

	@RequestMapping("/roy")
	public String test()
	{
		return "hello roy!";
	}


	public static void main(String[] args)
	{
		System.out.println(Hello.class.getName());
	}

}
