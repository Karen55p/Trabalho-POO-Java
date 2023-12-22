package trabalho.poo.animal.model;

import org.springframework.data.jpa.repository.JpaRepository;

import trabalho.poo.animal.model.entity.Animal;

public interface AnimalRepository extends 
	JpaRepository<Animal, Long>{

}
