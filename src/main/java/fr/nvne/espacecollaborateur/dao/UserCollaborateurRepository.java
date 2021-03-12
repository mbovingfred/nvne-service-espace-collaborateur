package fr.nvne.espacecollaborateur.dao;

import fr.nvne.espacecollaborateur.entities.UserCollaborateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RepositoryRestResource
public interface UserCollaborateurRepository extends JpaRepository<UserCollaborateur, Long> {
	public UserCollaborateur findByEmail(String email);
}
