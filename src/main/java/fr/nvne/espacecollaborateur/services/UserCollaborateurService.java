package fr.nvne.espacecollaborateur.services;

import fr.nvne.espacecollaborateur.entities.UserCollaborateur;
public interface UserCollaborateurService {
	public UserCollaborateur findByEmail(String email);
	public UserCollaborateur registerEntreprise(UserCollaborateur entreprise);
}
