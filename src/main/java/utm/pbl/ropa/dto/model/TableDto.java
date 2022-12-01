package utm.pbl.ropa.dto.model;

public class TableDto {
    private Long tableId;
    private boolean isPayed;

    public TableDto() {
    }

    public boolean isPayed() {
        return isPayed;
    }

    public void setPayed(boolean payed) {
        isPayed = payed;
    }

    public Long getTableId() {
        return tableId;
    }

    public void setTableId(Long tableId) {
        this.tableId = tableId;
    }
}
