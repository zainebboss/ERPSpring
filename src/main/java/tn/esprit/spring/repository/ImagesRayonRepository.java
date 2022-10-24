package tn.esprit.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.spring.models.ImagesRayon;
import tn.esprit.spring.models.Rayon;



public interface ImagesRayonRepository extends JpaRepository<ImagesRayon,Long>{
	public ImagesRayon save(ImagesRayon r);

	public ImagesRayon findByIdImageRayon(Long id);

	public void deleteByIdImageRayon(Long id);
	
	List<ImagesRayon> findByRayon(Rayon r);
}
