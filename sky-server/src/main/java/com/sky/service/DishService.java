package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.result.PageResult;
import com.sky.vo.DishVO;

import java.util.List;

public interface DishService {
    public void saveWithFlavor(DishDTO dishDTO);

    DishVO getByIdWithFlavor(Long id);

    PageResult pageQuery(DishPageQueryDTO dishPageQueryDTO);

    void deleteBatch(List<Long> ids);

    void updateWithFlavor(DishDTO dishDTO);
}
