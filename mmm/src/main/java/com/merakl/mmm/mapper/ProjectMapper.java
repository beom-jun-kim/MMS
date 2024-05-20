package com.merakl.mmm.mapper;

import java.util.List;

import com.merakl.mmm.vo.ProjectVO;

public interface ProjectMapper {
	public int projectSequence();
	public List<ProjectVO> projectList(int memberSeq);
	public ProjectVO project(ProjectVO projectVO);
	public void insertProject(ProjectVO projectVO);
	public void updateProject(ProjectVO projectVO);
	public void deleteProject(ProjectVO projectVO);
	
	// project 상세(프로그램)
	public void insertProjectProgram(ProjectVO projectVO);
	public void insertAllProjectProgram(ProjectVO projectVO);
}
