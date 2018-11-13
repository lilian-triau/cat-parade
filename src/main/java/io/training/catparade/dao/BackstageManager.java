package io.training.catparade.dao;

import java.util.List;

import io.training.catparade.model.Cat;

public interface BackstageManager {

	void addCat(Cat cat);
	
	void removeCat(Cat cat);
	
	List<Cat> findAllCats();
}
