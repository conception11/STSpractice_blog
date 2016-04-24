package com.gtgt.blog;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gtgt.blog.domain.model.entity.Hello;

public interface HelloDao extends JpaRepository<Hello, Integer> {

}
