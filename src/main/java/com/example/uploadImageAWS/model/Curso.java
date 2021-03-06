package com.example.uploadImageAWS.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Curso {
    @Id
    @GeneratedValue
    private Integer id;

    @NonNull
    private String titulo;

    private String imagenPath;

    @Transient
    private String imagenUrl;
}
