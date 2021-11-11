package lu.davidson.market.controller;

import lu.davidson.market.json.Item;
import lu.davidson.market.json.Price;
import lu.davidson.market.service.ItemService;
import lu.davidson.market.service.PriceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/core/items")
public class ItemController {

    private final ItemService itemService;
    private final PriceService priceService;

    public ItemController(ItemService itemService, PriceService priceService) {
        this.itemService = itemService;
        this.priceService = priceService;
    }
    @GetMapping
    public List<Item> getItemList()  {
        return itemService.findAllItems();
    }
    @GetMapping("/{itemRef}")
    public Item itemInfo(@PathVariable("itemRef") String reference)  {
        return itemService.findItem(reference);
    }

    @GetMapping("/{itemRef}/price")
    public Price itemPrice(@PathVariable("itemRef") String reference)  {
        return priceService.calculatePrice(reference);
    }
}
