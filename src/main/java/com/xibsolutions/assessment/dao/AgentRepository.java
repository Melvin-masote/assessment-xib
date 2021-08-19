package com.xibsolutions.assessment.dao;

import com.xibsolutions.assessment.entity.Agent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "agents",path="agents")
public interface AgentRepository extends JpaRepository<Agent,Long> {
}
