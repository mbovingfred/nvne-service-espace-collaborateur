package fr.nvne.espacecollaborateur.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.annotation.Transient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserCollaborateur {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
        private String uid;
	private String noms;
	private String prenoms;
	private String email;
	private String tel;
	private Date dateInscription;
	private Date birthdate;
	private String birthplace;
	private String adresse;
	private String postal;
	private String activite;
	private String cv;
	private String pceId;
	private String rib;
	@Transient
	private String formcv;
//	@Transient
//	private String formpceId;
//	@Transient
//	private String formrib;
	private String description;
//	@Transient
//	private String birthdateForm;
//	@Transient
//	private String heureFormContact;
}