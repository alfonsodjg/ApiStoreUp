package com.apistoreup.ApiStoreUp.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "categorias")
public class TipoCategoria {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter @Getter @Column(name = "id_categoria")
    private Long id_categoria;
    @Setter @Getter @Column(name = "tipo")
    private String tipo;
}
