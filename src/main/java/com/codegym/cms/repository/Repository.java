package com.codegym.cms.repository;

import java.util.List;

public interface Repository<T> {
    List<T> fillAll();

    T fillById(Long id);

    void save(T model);

    void remove(Long id);
}
