package com.xibsolutions.assessment.dao;

import com.xibsolutions.assessment.entity.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "managers",path="managers")
public interface ManagerRepository extends JpaRepository<Manager,Long> {
}
