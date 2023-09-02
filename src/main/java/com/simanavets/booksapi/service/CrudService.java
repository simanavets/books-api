package com.simanavets.booksapi.service;

import java.util.List;

public interface CrudService<T> {
    List<T> findAll();
    T findOneById(Integer id);
    T save(T t);
    void deleteById(Integer id);
}
