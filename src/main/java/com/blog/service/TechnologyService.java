package com.blog.service;

import com.blog.pojo.Type;

import java.util.List;

public interface TechnologyService {
    int saveTechnology(Type type);

    List<Type> getAllTechnology();

    int updateTechnology(Type type);

    int deleteTechnology(Long id);
}
