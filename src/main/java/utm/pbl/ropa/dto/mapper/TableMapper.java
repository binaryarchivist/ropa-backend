package utm.pbl.ropa.dto.mapper;


import utm.pbl.ropa.dto.model.TableDto;
import utm.pbl.ropa.model.TableEntity;

public class TableMapper {

    public static TableDto toTableDto(TableEntity table) {
        TableDto tableDto = new TableDto();

        tableDto.setTableId(table.getTableId());
        tableDto.setPayed(table.isPayed());

        return tableDto;
    }
}
