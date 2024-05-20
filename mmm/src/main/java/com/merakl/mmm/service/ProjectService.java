package com.merakl.mmm.service;

import com.merakl.mmm.vo.ProjectVO;

public interface ProjectService {
	public ProjectVO project(ProjectVO projectVO);
	public int insertProject(ProjectVO projectVO);
}
