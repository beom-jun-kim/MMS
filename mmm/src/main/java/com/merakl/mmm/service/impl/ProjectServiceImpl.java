package com.merakl.mmm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.merakl.mmm.mapper.ProjectMapper;
import com.merakl.mmm.service.ProjectService;
import com.merakl.mmm.vo.ProjectVO;
import com.merakl.mmm.vo.ResultVO;

@Service
public class ProjectServiceImpl implements ProjectService {
	
	@Autowired
	private ProjectMapper projectMapper;
	
	@Override
	public ProjectVO project(ProjectVO projectVO) {
		// TODO Auto-generated method stub
		return projectMapper.project(projectVO);
	}
	
	@Override
	public int insertProject(ProjectVO projectVO) { 
		// TODO Auto-generated method stub
		int projectSeq = projectMapper.projectSequence();
		projectVO.setSeqNo(projectSeq);
		projectMapper.insertProject(projectVO);
		
		if(projectVO.getProgramYn().equalsIgnoreCase("N")) {
			projectMapper.insertProjectProgram(projectVO);
		} else {
			projectMapper.insertAllProjectProgram(projectVO);
		}
		
		
		return projectSeq;
	}
	
}
