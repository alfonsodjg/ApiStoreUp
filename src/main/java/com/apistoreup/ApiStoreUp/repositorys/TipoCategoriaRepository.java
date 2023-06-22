package com.apistoreup.ApiStoreUp.repositorys;

import com.apistoreup.ApiStoreUp.models.TipoCategoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoCategoriaRepository extends JpaRepository<TipoCategoria,Long> {
}
