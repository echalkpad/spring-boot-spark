package com.spark.example.service.impl;

import com.spark.example.service.CollectionService;
import org.apache.spark.api.java.JavaSparkContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by bangl on 1/1/16.
 */
@Service
public class CollectionServiceImpl implements CollectionService{

   @Autowired
    private JavaSparkContext context;

    @Override
    public <T> void parallelize(List<T> list) {
       /* context.parallelize(list);*/
    }
}
