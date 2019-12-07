package com.anahita.demo.dal.repository;

import com.anahita.demo.dal.entity.Demo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DemoRepository extends JpaRepository<Demo,Long> {

}
