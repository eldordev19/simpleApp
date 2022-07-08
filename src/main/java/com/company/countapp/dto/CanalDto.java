package com.company.countapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.PackagePrivate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@PackagePrivate
public class CanalDto {

    String name;

    Double speed;
}
