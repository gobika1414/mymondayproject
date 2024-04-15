package com.mymondayproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mymondayproject.dao.MymondayprojectDao;
import com.mymondayproject.entity.Mymondayproject;
import com.mymondayproject.exception.NoAgeException;

@Service
public class MymondayprojectService {
	@Autowired
	MymondayprojectDao md;
	public String findpost(List<Mymondayproject> m) throws NoAgeException  {
		for(Mymondayproject student :m) {
			if(student.getAge() <18) {
				throw new NoAgeException ("Student age must be greater than 18");
			}
		}
		return md.findpost(m);
	}
	public List<Mymondayproject> findget() {
		return md.findget();
	}

}
