package com.apistoreup.ApiStoreUp.controllers;

import com.apistoreup.ApiStoreUp.models.DatosCategoriaModel;
import com.apistoreup.ApiStoreUp.models.TipoCategoria;
import com.apistoreup.ApiStoreUp.services.DatosCategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping
public class DatosCategoriaController {

    @Autowired
    DatosCategoriaService datosCategoriaService;

    @RequestMapping(value = "api/getAllDatos",method = RequestMethod.GET)
    public ArrayList<DatosCategoriaModel> getAllDates(){
        return datosCategoriaService.getAll();
    }
    @RequestMapping(value = "api/getAllTipoCategorias",method = RequestMethod.GET)
    public List<TipoCategoria> getAllTipoCategorias() {
        return datosCategoriaService.getAllTipoCategorias();
    }
    @RequestMapping(value = "api/insert/dates/categoria",method = RequestMethod.POST)
    public void inserDates(@RequestBody DatosCategoriaModel datosCategoriaModel){
        this.datosCategoriaService.insertDatosCategoria(datosCategoriaModel);
    }
}



