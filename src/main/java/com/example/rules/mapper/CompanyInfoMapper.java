package com.example.rules.mapper;

import com.example.rules.model.CompanyInfo;

public interface CompanyInfoMapper {
    int insert(CompanyInfo record);

    int insertSelective(CompanyInfo record);
}