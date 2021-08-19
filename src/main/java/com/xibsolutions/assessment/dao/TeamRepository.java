package com.xibsolutions.assessment.dao;

import com.xibsolutions.assessment.entity.Team;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RequestBody;

@RepositoryRestResource(collectionResourceRel = "teams",path="teams")
public interface TeamRepository extends PagingAndSortingRepository<Team,Long> {

}
