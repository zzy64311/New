package com.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.mapper.CheckreportImagesMapper;
import com.api.pojo.CheckreportImages;

@Service
public class CheckreportImagesService {
	@Autowired
	private CheckreportImagesMapper CheckreportImagesMapper;
	
	public CheckreportImages getCheckreportImages(){
		CheckreportImages CheckreportImages = this.CheckreportImagesMapper.selectByPrimaryKey(16);
		return CheckreportImages;
	}
	public List<CheckreportImages> getCheckreportImagesList(){
		return this.CheckreportImagesMapper.selectCheckreportImages();
	}
}
