package com.company.countapp.service;

import com.company.countapp.entity.BuyItem;
import com.company.countapp.entity.Canal;
import com.company.countapp.entity.Length;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class CountService {

    @Autowired
    CanalService canalService;

    @Autowired
    PriceLengthService priceLengthService;

    public Double countPrice(BuyItem buyItem) {
        Canal canalById = canalService.getCanalById(String.valueOf(buyItem.getCanalId()));
        Length priceLengthById = priceLengthService.getPriceLengthById(String.valueOf(buyItem.getLengthId()));
        Integer count = buyItem.getCount();
      //  Double length = buyItem.getLength();

        Double res = null;
        if (count == 1) {
            priceLengthById.getPrice();
        }
        return res;
    }
}
