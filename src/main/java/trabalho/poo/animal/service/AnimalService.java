package trabalho.poo.animal.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import trabalho.poo.animal.model.AnimalRepository;
import trabalho.poo.animal.model.dto.AnimalDto;
import trabalho.poo.animal.model.entity.Animal;

@Service
public class AnimalService {

	@Autowired
	AnimalRepository injecao;
	
	public void deleteAnimal(Long id) {
		if(injecao.existsById(id)) {
			injecao.deleteById(id);
		}
	}
	
	public AnimalDto addAnimal(AnimalDto animalDto) {
		Animal animal = converteToAnimal(animalDto);
		Animal novoAnimal = injecao.save(animal);
		return converteToAnimalDto(novoAnimal);
	}
	
	public AnimalDto attAnimal(AnimalDto animalDto) {
		Animal animal = converteToAnimal(animalDto);
		Animal novoAnimal = injecao.save(animal);
		return converteToAnimalDto(novoAnimal);
	}
	
	public List<AnimalDto> getAnimais(){
		List<Animal> animais = injecao.findAll();
		return converteToListaDto(animais);
	}
	
	public List<AnimalDto> converteToListaDto(List<Animal> animais){
		List<AnimalDto> listaDto = new ArrayList<AnimalDto>();
		for(int i=0;i<animais.size();i++) {
			listaDto.add(converteToAnimalDto(animais.get(i)));
		}
		return listaDto;
	}
	
	public Animal converteToAnimal(AnimalDto animalDto) {
		Animal animal = new Animal();
		animal.setAlimentacao(animalDto.getAlimentacao());
		animal.setEspecie(animalDto.getEspecie());
		animal.setId(animalDto.getId());
		animal.setnFilhote(animalDto.getnFilhote());
		animal.setQtdPata(animalDto.getQtdPata());
		animal.setReproducao(animalDto.getReproducao());
		
		return animal;
	}
	
	public AnimalDto converteToAnimalDto(Animal animal) {
		AnimalDto animalDto = new AnimalDto(animal);
		return animalDto;
	}
}
