package com.example.mx.pacs008.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "mx_pacs_008_message")
public class MxPacs008Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
