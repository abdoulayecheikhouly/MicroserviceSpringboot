package com.acl.microservice.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "products")
@Builder
@Entity
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;
    private String description;
    private double prix;
    private int quantite;

    // Relation many-to-one avec Categorie
    @ManyToOne

    @JoinColumn(name = "categorie_id")
    private Category category;




}

