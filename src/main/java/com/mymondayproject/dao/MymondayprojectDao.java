package com.mymondayproject.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mymondayproject.entity.Mymondayproject;
import com.mymondayproject.repository.MymondayprojectRepository;

@Repository
public class MymondayprojectDao {
	@Autowired
	MymondayprojectRepository mr;
	public String findpost(List<Mymondayproject> m) {
		 mr.saveAll(m);
		 return "posted successfully";
	}
	public List<Mymondayproject> findget() {
		return mr.findAll();
	}



}
