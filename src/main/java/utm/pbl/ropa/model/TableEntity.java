package utm.pbl.ropa.model;


import javax.persistence.Table;
import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "ropa_table")
public class TableEntity {
    @Id
    @SequenceGenerator(name = "tableSeqGen", sequenceName = "tableSeq", allocationSize = 100)
    @GeneratedValue(generator = "tableSeqGen")
    @Column(name = "table_id")
    private Long tableId;

    private boolean isTaken;

    private boolean isPayed;

    @OneToMany
    private Set<Cart> carts;

    public void Table() {
    }

    public Long getTableId() {
        return tableId;
    }

    public void setTableId(Long tableId) {
        this.tableId = tableId;
    }

    public boolean isTaken() {
        return isTaken;
    }

    public void setTaken(boolean taken) {
        isTaken = taken;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public void setPayed(boolean payed) {
        isPayed = payed;
    }

    public Set<Cart> getCarts() {
        return carts;
    }

    public void setCarts(Set<Cart> carts) {
        this.carts = carts;
    }
}
