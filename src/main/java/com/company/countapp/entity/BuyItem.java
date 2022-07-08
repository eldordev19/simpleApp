package com.company.countapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BuyItem {

    UUID canalId;

    Integer count;

    UUID lengthId;

    Double length;
}
