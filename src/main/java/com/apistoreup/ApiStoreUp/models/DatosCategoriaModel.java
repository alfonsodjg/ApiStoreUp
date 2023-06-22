package com.apistoreup.ApiStoreUp.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "datos_categoria")
public class DatosCategoriaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_datos")
    @Getter @Setter
    private Long idDatos;
    @Column(name = "nombre") @Getter @Setter
    private String nombre;
    @Column(name = "horario") @Getter @Setter
    private String horario;
    @Column(name = "promocion") @Getter @Setter
    private String promocion;
    @Column(name = "ubicacion") @Getter @Setter
    private String ubicacion;
    @Column(name = "productos") @Getter @Setter
    private String productos;
    @ManyToOne
    @JoinColumn(name = "id_tipo_categoria")
    @Setter @Getter
    private TipoCategoria tipoCategoria;
}
