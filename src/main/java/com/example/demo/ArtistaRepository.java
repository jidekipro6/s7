package com.example.demo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;



@RepositoryRestResource(collectionResourceRel = "Artista", path = "Artista")
public interface ArtistaRepository extends PagingAndSortingRepository< Artista, Integer>,CrudRepository<Artista, Integer> {
    
    List<Artista> findByNombre(@Param("nombre") String nombre);
     

}