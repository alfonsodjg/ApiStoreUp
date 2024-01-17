package com.apistoreup.ApiStoreUp.services;

import com.apistoreup.ApiStoreUp.models.DatosCategoriaModel;
import com.apistoreup.ApiStoreUp.models.TipoCategoria;
import com.apistoreup.ApiStoreUp.repositorys.DatosCategoriaRepository;
import com.apistoreup.ApiStoreUp.repositorys.TipoCategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class DatosCategoriaService {
    @Autowired
    DatosCategoriaRepository datosCategoriaRepository;
    @Autowired
    TipoCategoriaRepository tipoCategoriaRepository;

    public ArrayList<DatosCategoriaModel> getAll(){
        return (ArrayList<DatosCategoriaModel>) datosCategoriaRepository.findAll();
    }
    public void insertDatosCategoria(@RequestBody DatosCategoriaModel datosCategoriaModel){
        datosCategoriaRepository.save(datosCategoriaModel);
    }
    public List<TipoCategoria> getAllTipoCategorias() {
        return tipoCategoriaRepository.findAll();
    }
    public List<DatosCategoriaModel> getTiendasByCategoria(String categoria) {
        return datosCategoriaRepository.findByTipoCategoria_Tipo(categoria);
    }
}
