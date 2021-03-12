package fr.nvne.espacecollaborateur.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.nvne.espacecollaborateur.dao.EntrepriseRepository;
import fr.nvne.espacecollaborateur.entities.UserCollaborateur;
@Service
public class UserCollaborateurServiceImpl implements UserCollaborateurService {

	@Autowired
	private EntrepriseRepository entrepriseRepository;
	
	@Override
	public UserCollaborateur registerEntreprise(UserCollaborateur entreprise) {
		return this.entrepriseRepository.save(entreprise);
	}

	@Override
	public UserCollaborateur findByEmail(String email) {
		return entrepriseRepository.findByEmail(email);
	}
}
