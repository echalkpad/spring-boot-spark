package com.spark.example.service;

import java.util.List;

/**
 * Created by bangnl on 1/1/16.
 */
public interface CollectionService {
    <T> void  parallelize(List<T> list);
}
