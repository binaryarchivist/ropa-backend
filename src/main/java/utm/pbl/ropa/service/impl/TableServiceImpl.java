package utm.pbl.ropa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import utm.pbl.ropa.model.Cart;
import utm.pbl.ropa.model.TableEntity;
import utm.pbl.ropa.repository.TableRepository;
import utm.pbl.ropa.service.TableService;

import java.util.NoSuchElementException;
import java.util.Set;

@Component
public class TableServiceImpl implements TableService {
    private final TableRepository tableRepository;

    @Autowired
    public TableServiceImpl(TableRepository tableRepository) {
        this.tableRepository = tableRepository;
    }

    @Override
    public TableEntity takeTable(Long tableId, Set<Cart> carts) {
        TableEntity table = tableRepository
                .findById(String.valueOf(tableId))
                .orElseThrow(NoSuchElementException::new);

        table.setTaken(true);

        table.setCarts(carts);
        return tableRepository.save(table);
    }

    @Override
    public TableEntity updateTable(Long tableId, TableEntity newTable) {
        return tableRepository.findById(String.valueOf(tableId))
                .map(table -> {
                    table.setTableId(newTable.getTableId());
                    table.setCarts(newTable.getCarts());
                    table.setTaken(newTable.isTaken());
                    return tableRepository.save(table);
                })
                .orElseThrow(NoSuchElementException::new);
    }
}
