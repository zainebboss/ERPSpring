package tn.esprit.spring.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import tn.esprit.spring.models.ImagesRayon;


public interface IImagesRayon {

	List<ImagesRayon> retrieveAllImagesRayons();
	
	ImagesRayon getImageRayon(Long id);

	ImagesRayon addImageRayon(ImagesRayon r, Long idRayon);

	@Transactional
	void deleteImageRayon(Long id);

	ImagesRayon updateImageRayon(ImagesRayon r);
	
	List<ImagesRayon> getImageRayonParRayon(Long id);
}
