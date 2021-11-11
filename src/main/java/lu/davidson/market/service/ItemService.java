package lu.davidson.market.service;

import lu.davidson.market.json.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {

    private static final List<Item> items;
    static
    {
        items = new ArrayList<>();
        items.add(new Item("REF0001", "ITEM 0001"));
        items.add(new Item("REF0002", "ITEM 0002"));
        items.add(new Item("REF0003", "ITEM 0003"));
        items.add(new Item("REF0004", "ITEM 0004"));
    }
    public Item findItem(String reference){
        return items.stream().filter(p -> p.getReference().equals(reference)).
                findFirst().orElse(null);
    }
    public List<Item> findAllItems(){
        return items;
    }
}
