package com.company.countapp.repo;

import com.company.countapp.entity.CanalItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CanalItemRepository extends JpaRepository<CanalItem, UUID> {
}
