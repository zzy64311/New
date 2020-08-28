package com.api.mapper;

import java.util.List;

import com.api.pojo.CheckreportImages;

public interface CheckreportImagesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CheckreportImages record);

    int insertSelective(CheckreportImages record);

    CheckreportImages selectByPrimaryKey(Integer id);
    
    List<CheckreportImages> selectCheckreportImages();

    int updateByPrimaryKeySelective(CheckreportImages record);

    int updateByPrimaryKey(CheckreportImages record);
}