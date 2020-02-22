package com.appart.ma.repo;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.appart.ma.model.Appartement;

public interface AppartRepo extends JpaRepository<Appartement, Long> {
	List<Appartement> findBySurface(int s);
	Page<Appartement> findByNbpiece(int nb, Pageable p);
}
