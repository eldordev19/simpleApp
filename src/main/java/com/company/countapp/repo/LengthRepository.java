package com.company.countapp.repo;

import com.company.countapp.entity.Length;
import org.hibernate.type.UUIDBinaryType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LengthRepository extends JpaRepository<Length, UUID> {
}
