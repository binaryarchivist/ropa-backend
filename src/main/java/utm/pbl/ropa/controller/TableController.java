package utm.pbl.ropa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import utm.pbl.ropa.dto.model.TableDto;
import utm.pbl.ropa.model.Cart;
import utm.pbl.ropa.model.TableEntity;
import utm.pbl.ropa.service.TableService;

import java.util.Set;

import static utm.pbl.ropa.dto.mapper.TableMapper.toTableDto;


@RestController
@RequestMapping("table")
public class TableController {
    private final TableService tableService;

    @Autowired
    public TableController(TableService tableService) {
        this.tableService = tableService;
    }

    @PostMapping("{tableId}")
    public TableDto takeTable(@PathVariable Long tableId, @RequestBody Set<Cart> cartIds) {

        return toTableDto(tableService.takeTable(tableId, cartIds));
    }

    @PutMapping("{tableId}")
    public TableDto updateTable(@PathVariable Long tableId, @RequestBody TableEntity table) {
        return toTableDto(tableService.updateTable(tableId, table));
    }
}
