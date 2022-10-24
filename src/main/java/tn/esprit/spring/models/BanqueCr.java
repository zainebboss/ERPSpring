package tn.esprit.spring.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
public class BanqueCr implements Serializable {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private long id_bq;
	private String NameBanque;
	@Temporal(TemporalType.DATE)
	private Date DateDebutCr;
	@Temporal(TemporalType.DATE)
	private Date DateFinaltCr;
	private Float MontantCr;
	@Enumerated(EnumType.STRING)
	private  StatutCredit statutcredit;
	
}
