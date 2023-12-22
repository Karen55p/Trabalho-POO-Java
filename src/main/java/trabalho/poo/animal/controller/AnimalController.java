package trabalho.poo.animal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import trabalho.poo.animal.model.dto.AnimalDto;
import trabalho.poo.animal.service.AnimalService;

@RestController
@RequestMapping("/animal")
public class AnimalController {

	@Autowired
	AnimalService injecao;
	
	@GetMapping
	public List<AnimalDto> getAnimais(){
		return injecao.getAnimais();
	}
	
	@PostMapping
	public AnimalDto addAnimal(@RequestBody AnimalDto animalDto) {
		return injecao.addAnimal(animalDto);
	}
	
	@DeleteMapping("/{id}")
	public void removeAnimal(@PathVariable("id") Long id) {
		injecao.deleteAnimal(id);
	}
	
	@PutMapping
	public AnimalDto updateAnimal(@RequestBody AnimalDto animalDto) {
		return injecao.attAnimal(animalDto);
	}
}
