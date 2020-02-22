/**
 * 
 */
package com.appart.ma.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author BENLAHMAR EL Habib
 *
 */

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Appartement {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long idap;
	public int nbpiece;
	public int surface;
	@Embedded
	public Adresse adress;
	
}
