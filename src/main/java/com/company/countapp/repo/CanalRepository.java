package com.company.countapp.repo;

import com.company.countapp.entity.Canal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CanalRepository extends JpaRepository<Canal, UUID> {
}
