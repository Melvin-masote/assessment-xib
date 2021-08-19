package com.xibsolutions.assessment;

import com.xibsolutions.assessment.dao.AgentRepository;
import com.xibsolutions.assessment.dao.ManagerRepository;
import com.xibsolutions.assessment.dao.TeamRepository;
import com.xibsolutions.assessment.entity.Agent;
import com.xibsolutions.assessment.entity.Manager;
import com.xibsolutions.assessment.entity.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class AssessmentApplication {

	@Autowired
	private AgentRepository repository;
    @Autowired
	private ManagerRepository managerRepository;
   @Autowired
   private TeamRepository teamRepository;



	@PostConstruct
	public void init(){

		repository.saveAll(Stream.of(
			new Agent("melvin","masote",980316540084L),
				new Agent("kevin","gayes",980316540084L),
				new Agent("albert","rui",980316540084L),
				new Agent("steve","green",980316540084L),
				new Agent("josh","blue",980316540084L),
				new Agent("vin","aqua",980316540084L),
				new Agent("kat","makena",980316540084L)
		).collect(Collectors.toList()));

		managerRepository.saveAll(Stream.of(
				new Manager(1,"melvin","masote"),
				new Manager(1,"pep","guadiola"),
				new Manager(1,"jose","morinho"),
				new Manager(1,"jurgen","klopp"),
				new Manager(1,"frank","lampard"),
				new Manager(1,"sean","dyche")
		).collect(Collectors.toList()));

		Object manager;
		teamRepository.saveAll(Stream.of(
            		new Team("barcelona"),
				new Team("man city"),
				new Team("real madrid"),
				new Team("psg"),
				new Team("monaco"),
				new Team("arsenal")
			).collect(Collectors.toList()));
	}



	public static void main(String[] args) {
		SpringApplication.run(AssessmentApplication.class, args);
	}

}
