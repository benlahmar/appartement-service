/**
 * 
 */
package com.appart.ma.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.appart.ma.model.Appartement;
import com.appart.ma.repo.AppartRepo;

/**
 * @author BENLAHMAR EL Habib
 *
 */
@RestController
public class AppartRest {
	@Autowired
	AppartRepo arepo;
	@GetMapping("/appartements")
	public List<Appartement> all()
	{
		return arepo.findAll();
	}

	@GetMapping("/appartements/bypiece")
	public Page<Appartement> allbynbpiece(@RequestParam("np") int nb, @RequestParam("page")int page, @RequestParam("size")int size)
	{
		Pageable p=PageRequest.of(page, size);
		return arepo.findByNbpiece(nb,p);
	}
	
	
	@GetMapping("/appartements/{id}")
	public Appartement appart(@PathVariable Long id)
	{
		Optional<Appartement> x = arepo.findById(id);
		if(x.isPresent())
			return 
					x.get();
		else
			return null;
	}
	@PostMapping("/appartements")
	public ResponseEntity<Appartement> addappart(@RequestBody Appartement a)
	{
		Appartement aa=arepo.save(a);
		ResponseEntity<Appartement> res=new ResponseEntity<>(aa, HttpStatus.ACCEPTED);
		return res;
		
	}
}
