package com.mymondayproject.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mymondayproject.MymondayprojectApplication;
import com.mymondayproject.entity.Mymondayproject;
import com.mymondayproject.exception.NoAgeException;
import com.mymondayproject.service.MymondayprojectService;

@RestController

public class MymondayprojectController {
	@Autowired
	MymondayprojectService ms;
	static Logger log=Logger.getLogger(MymondayprojectApplication.class); 

	@PostMapping(value="/PostAll")
	
	public String findpost(@RequestBody List<Mymondayproject> m)throws NoAgeException  {
		PropertyConfigurator.configure("my.properties");
		log.info(ms.findpost(m));
		
		return ms.findpost(m);
	}
	@GetMapping(value="/GetAll")
	public List<Mymondayproject> findget() {
		PropertyConfigurator.configure("my.properties");
		log.info(ms.findget());
		return ms.findget();
	}

}
