package utm.pbl.ropa.service;

import utm.pbl.ropa.model.Cart;
import utm.pbl.ropa.model.TableEntity;

import java.util.Set;


public interface TableService {
    TableEntity takeTable(Long tableId, Set<Cart> carts);

    TableEntity updateTable(Long tableId, TableEntity tableEntity);

}
