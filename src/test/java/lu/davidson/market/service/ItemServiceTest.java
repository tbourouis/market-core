package lu.davidson.market.service;

import lu.davidson.market.json.Item;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class ItemServiceTest {

    @InjectMocks
    ItemService service;

    @Test
    public void testFindAllEmployees()
    {
        List<Item> empList = service.findAllItems();
        assertEquals(4, empList.size());
    }

}
