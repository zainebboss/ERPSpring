package tn.esprit.spring.models;

import java.io.Serializable;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
public class Facture  implements Serializable {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private long id;
	@Temporal(TemporalType.DATE)
	private Date DateFacture;
	private String Article;
	private float montant;
    @ManyToOne
    Fournisseur fournisseurs;
}
