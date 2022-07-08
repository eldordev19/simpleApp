package com.company.countapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.PackagePrivate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@PackagePrivate
@Entity(name = "canal_item")
public class CanalItem {
    @Id
    @GeneratedValue
    UUID id;

    @ManyToOne
    Length price;

    @ManyToOne
    Canal canal;

}
