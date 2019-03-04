package com.example.mappers;

import com.example.entity.Category;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryMapper {

    public List<Category> GetCategoryByCategoryType(String category_type);

}
