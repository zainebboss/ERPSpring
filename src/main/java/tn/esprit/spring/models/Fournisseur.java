package tn.esprit.spring.models;
import java.io.Serializable;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor
@ToString
@EqualsAndHashCode 
public class Fournisseur implements Serializable {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private long id_fr;
	private String NomFournisseur;
	private String Adresse;
	private int NumCompte;
	private int NumTel;
	@OneToMany(cascade=CascadeType.ALL)
	private Set<Facture> Factures;
	
}
