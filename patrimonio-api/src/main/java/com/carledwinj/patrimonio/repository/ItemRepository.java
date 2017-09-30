package com.carledwinj.patrimonio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carledwinj.patrimonio.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
