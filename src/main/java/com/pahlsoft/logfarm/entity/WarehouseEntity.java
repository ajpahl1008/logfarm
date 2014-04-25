package com.pahlsoft.logfarm.entity;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by aj on 4/6/14.
 */
@Entity
@Table(name = "warehouse", schema = "", catalog = "logfarm")
@IdClass(WarehouseEntityPK.class)
public class WarehouseEntity {
    private int transactionId;
    private String sourceFileName;
    private String destination;
    private Date timeDateStamp;
    private String logfileUuid;
    private String daysToLive;

    @Id
    @Column(name = "TRANSACTION_ID", nullable = false, insertable = true, updatable = true)
    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    @Basic
    @Column(name = "SOURCE_FILE_NAME", nullable = false, insertable = true, updatable = true, length = 128)
    public String getSourceFileName() {
        return sourceFileName;
    }

    public void setSourceFileName(String sourceFileName) {
        this.sourceFileName = sourceFileName;
    }

    @Basic
    @Column(name = "DESTINATION", nullable = false, insertable = true, updatable = true, length = 128)
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Basic
    @Column(name = "TIME_DATE_STAMP", nullable = false, insertable = true, updatable = true)
    public Date getTimeDateStamp() {
        return timeDateStamp;
    }

    public void setTimeDateStamp(Date timeDateStamp) {
        this.timeDateStamp = timeDateStamp;
    }

    @Id
    @Column(name = "LOGFILE_UUID", nullable = false, insertable = true, updatable = true, length = 128)
    public String getLogfileUuid() {
        return logfileUuid;
    }

    public void setLogfileUuid(String logfileUuid) {
        this.logfileUuid = logfileUuid;
    }

    @Basic
    @Column(name = "DAYS_TO_LIVE", nullable = false, insertable = true, updatable = true, length = 45)
    public String getDaysToLive() {
        return daysToLive;
    }

    public void setDaysToLive(String daysToLive) {
        this.daysToLive = daysToLive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WarehouseEntity that = (WarehouseEntity) o;

        if (transactionId != that.transactionId) return false;
        if (daysToLive != null ? !daysToLive.equals(that.daysToLive) : that.daysToLive != null) return false;
        if (destination != null ? !destination.equals(that.destination) : that.destination != null) return false;
        if (logfileUuid != null ? !logfileUuid.equals(that.logfileUuid) : that.logfileUuid != null) return false;
        if (sourceFileName != null ? !sourceFileName.equals(that.sourceFileName) : that.sourceFileName != null)
            return false;
        if (timeDateStamp != null ? !timeDateStamp.equals(that.timeDateStamp) : that.timeDateStamp != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = transactionId;
        result = 31 * result + (sourceFileName != null ? sourceFileName.hashCode() : 0);
        result = 31 * result + (destination != null ? destination.hashCode() : 0);
        result = 31 * result + (timeDateStamp != null ? timeDateStamp.hashCode() : 0);
        result = 31 * result + (logfileUuid != null ? logfileUuid.hashCode() : 0);
        result = 31 * result + (daysToLive != null ? daysToLive.hashCode() : 0);
        return result;
    }
}
