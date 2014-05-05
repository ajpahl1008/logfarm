package com.pahlsoft.logfarm.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by aj on 4/28/2014.
 */
public class WarehouseEntityPK implements Serializable {
    private int transactionId;
    private String logfileUuid;

    @Column(name = "TRANSACTION_ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    @Column(name = "LOGFILE_UUID", nullable = false, insertable = true, updatable = true, length = 128)
    @Id
    public String getLogfileUuid() {
        return logfileUuid;
    }

    public void setLogfileUuid(String logfileUuid) {
        this.logfileUuid = logfileUuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WarehouseEntityPK that = (WarehouseEntityPK) o;

        if (transactionId != that.transactionId) return false;
        if (logfileUuid != null ? !logfileUuid.equals(that.logfileUuid) : that.logfileUuid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = transactionId;
        result = 31 * result + (logfileUuid != null ? logfileUuid.hashCode() : 0);
        return result;
    }
}
