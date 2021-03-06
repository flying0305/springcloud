package com.zff.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zff.entities.Flower;
import com.zff.service.FlowerService;

/*
 * @pathvariable("") 占位符映射
 * */
@RestController
public class FlowerController {
	@Autowired
	FlowerService flowerService ;
	//这个提供给feign的server来访问，写的要和这个“/find”一样
	@RequestMapping(value="/find")
	public List<Flower> getFlower() {
		System.out.println("=============");
		return flowerService.listFlower();
	}
}
