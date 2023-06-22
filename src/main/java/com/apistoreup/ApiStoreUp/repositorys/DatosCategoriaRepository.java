package com.apistoreup.ApiStoreUp.repositorys;

import com.apistoreup.ApiStoreUp.models.DatosCategoriaModel;
import com.apistoreup.ApiStoreUp.models.TipoCategoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DatosCategoriaRepository extends JpaRepository<DatosCategoriaModel,Long> {

}
