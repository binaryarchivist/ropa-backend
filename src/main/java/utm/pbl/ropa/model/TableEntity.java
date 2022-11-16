package utm.pbl.ropa.model;


import javax.persistence.Table;
import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name="ropa_table")
public class TableEntity {
    @Id
    @SequenceGenerator(name = "tableSeqGen", sequenceName = "tableSeq", allocationSize = 100)
    @GeneratedValue(generator = "tableSeqGen")
    @Column(name="table_id")
    private Integer tableId;

    private boolean isTaken;

    @OneToMany
    private Set<Cart> carts;

    public void Table() {
    }

    public Integer getTableId() {
        return tableId;
    }

    public void setTableId(Integer tableId) {
        this.tableId = tableId;
    }

    public boolean isTaken() {
        return isTaken;
    }

    public void setTaken(boolean taken) {
        isTaken = taken;
    }

    public Set<Cart> getCarts() {
        return carts;
    }

    public void setCarts(Set<Cart> carts) {
        this.carts = carts;
    }
}
