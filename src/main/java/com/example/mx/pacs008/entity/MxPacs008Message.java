package com.example.mx.pacs008.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "mx_pacs_008_message")
public class MxPacs008Message {

    @Id
    @GeneratedValue
    private Long id;
}
