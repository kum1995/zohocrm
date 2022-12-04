package com.CrudOperation.repositiory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CrudOperation.entities.Lead;

public interface LeadRepositiory extends JpaRepository<Lead,Long> {

}
