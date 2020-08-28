package com.api;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.pojo.CheckreportImages;
import com.api.service.CheckreportImagesService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(tags = "检验报告管理相关接口")
@RequestMapping("/report")
public class ReportAppController {

	@Autowired
	private CheckreportImagesService checkreportImagesService;
	
	@GetMapping(value = "/getReport")
	@ApiOperation("检验报告接口")
	@ApiImplicitParams({ 
		@ApiImplicitParam(name="access_token",value="令牌",dataType="String",paramType="query"),
		@ApiImplicitParam(name="id",value="检验报告ID",dataType="int",paramType="query"),
	})
	public Object getReport(HttpServletRequest request, String access_token,Integer id) {
		System.out.println(checkreportImagesService);
		System.out.println("ok.............");
		return new String("ok");
	}
	
	
	@GetMapping(value = "/getReportList")
	public Object getTCheckreportImagesList(HttpServletRequest request, String access_token,Integer id,Integer page) {
		PageHelper.startPage(page,2); 
		List<CheckreportImages> checkreportImagesList = this.checkreportImagesService.getCheckreportImagesList();
		PageInfo<CheckreportImages> pageInfo = new PageInfo<CheckreportImages>(checkreportImagesList);
		System.out.println(checkreportImagesList.size());
		return pageInfo;
	}


	@Override
	public String toString() {
		return "ReportAppController [checkreportImagesService=" + checkreportImagesService + "]";
	}
}
