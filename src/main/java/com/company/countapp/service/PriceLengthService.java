package com.company.countapp.service;

import com.company.countapp.dto.PriceLengthDto;
import com.company.countapp.entity.Length;
import com.company.countapp.repo.LengthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PriceLengthService {

    @Autowired
    LengthRepository lengthRepository;


    public Length getPriceLengthById(String id) {
        return lengthRepository.findById(UUID.fromString(id)).get();
    }

    public List<Length> getAllPriceLengths() {
        return lengthRepository.findAll();
    }

    public void savePriceLength(PriceLengthDto priceDto) {
        Length length = new Length();
        length.setLength(priceDto.getLength());
        length.setPrice(priceDto.getPrice());
        lengthRepository.save(length);
    }

    public void updatePriceLength(String id, PriceLengthDto priceDto) {
        Length length = getPriceLengthById(id);
        length.setLength(priceDto.getLength());
        length.setPrice(priceDto.getPrice());
        lengthRepository.save(length);
    }

    public void deletePriceLengthById(String id) {
        lengthRepository.deleteById(UUID.fromString(id));
    }
}
