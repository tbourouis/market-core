package lu.davidson.market.service;

import lu.davidson.market.json.Price;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class PriceService {

    public Price calculatePrice(String reference){
        return new Price(new Random().nextDouble(), "EUR");
    }
}
