package com.apistoreup.ApiStoreUp.repositorys;

import com.apistoreup.ApiStoreUp.models.DatosCategoriaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DatosCategoriaRepository extends JpaRepository<DatosCategoriaModel, Long> {
    List<DatosCategoriaModel> findByTipoCategoria_Tipo(String tipo);
}
