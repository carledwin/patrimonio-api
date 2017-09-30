package com.carledwinj.patrimonio.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carledwinj.patrimonio.model.Item;
import com.carledwinj.patrimonio.repository.ItemRepository;

@RestController
@RequestMapping("/itens")
@CrossOrigin("${origem-permitida}")
public class ItemResource {

	@Autowired
	private ItemRepository repository;
	
	@GetMapping
	public List<Item> listar(){
		return repository.findAll();
	}
	
	@PostMapping
	public Item adicionar(@RequestBody @Valid Item item) {
		return repository.save(item);
	}
	
}
