package com.company.countapp.service;

import com.company.countapp.dto.CanalDto;
import com.company.countapp.entity.Canal;
import com.company.countapp.repo.CanalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CanalService {

    @Autowired
    CanalRepository canalRepository;

    public void saveCanal (CanalDto canalDto) {
        Canal canal = new Canal();
        canal.setName(canalDto.getName());
        canal.setSpeed(canalDto.getSpeed());
        canalRepository.save(canal);
    }

    public void updateCanal (String id, CanalDto canalDto) {
        Canal canal = canalRepository.findById(UUID.fromString(id)).get();
        canal.setName(canalDto.getName());
        canal.setSpeed(canalDto.getSpeed());
        canalRepository.save(canal);
    }

    public Canal getCanalById (String id) {
        return canalRepository.findById(UUID.fromString(id)).get();
    }

    public List<Canal> getAllCanals () {
        return canalRepository.findAll();
    }

    public void deleteCanalById (String id) {
        canalRepository.deleteById(UUID.fromString(id));
    }
}
