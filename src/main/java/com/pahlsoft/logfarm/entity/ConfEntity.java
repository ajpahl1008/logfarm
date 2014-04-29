package com.pahlsoft.logfarm.entity;

import javax.persistence.*;
import java.util.Arrays;

/**
 * Created by aj on 4/28/2014.
 */
@Entity
@Table(name = "conf", schema = "", catalog = "logfarm")
public class ConfEntity {
    private int confId;
    private int refreshRate;
    private String destination;
    private String destinationType;
    private String sourceDir;
    private int compression;
    private String format;
    private String defaultRetentionDays;
    private String timeDateStampFmt;
    private String s3Url;
    private byte[] s3Key;
    private String atmosUrl;
    private byte[] atmosKey;
    private String sshUrl;
    private byte[] sshKey;
    private String cifsUrl;

    @Id
    @Column(name = "CONF_ID", nullable = false, insertable = true, updatable = true)
    public int getConfId() {
        return confId;
    }

    public void setConfId(int confId) {
        this.confId = confId;
    }

    @Basic
    @Column(name = "REFRESH_RATE", nullable = false, insertable = true, updatable = true)
    public int getRefreshRate() {
        return refreshRate;
    }

    public void setRefreshRate(int refreshRate) {
        this.refreshRate = refreshRate;
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
    @Column(name = "DESTINATION_TYPE", nullable = false, insertable = true, updatable = true, length = 45)
    public String getDestinationType() {
        return destinationType;
    }

    public void setDestinationType(String destinationType) {
        this.destinationType = destinationType;
    }

    @Basic
    @Column(name = "SOURCE_DIR", nullable = false, insertable = true, updatable = true, length = 128)
    public String getSourceDir() {
        return sourceDir;
    }

    public void setSourceDir(String sourceDir) {
        this.sourceDir = sourceDir;
    }

    @Basic
    @Column(name = "COMPRESSION", nullable = false, insertable = true, updatable = true)
    public int getCompression() {
        return compression;
    }

    public void setCompression(int compression) {
        this.compression = compression;
    }

    @Basic
    @Column(name = "FORMAT", nullable = false, insertable = true, updatable = true, length = 45)
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Basic
    @Column(name = "DEFAULT_RETENTION_DAYS", nullable = false, insertable = true, updatable = true, length = 45)
    public String getDefaultRetentionDays() {
        return defaultRetentionDays;
    }

    public void setDefaultRetentionDays(String defaultRetentionDays) {
        this.defaultRetentionDays = defaultRetentionDays;
    }

    @Basic
    @Column(name = "TIME_DATE_STAMP_FMT", nullable = false, insertable = true, updatable = true, length = 45)
    public String getTimeDateStampFmt() {
        return timeDateStampFmt;
    }

    public void setTimeDateStampFmt(String timeDateStampFmt) {
        this.timeDateStampFmt = timeDateStampFmt;
    }

    @Basic
    @Column(name = "S3_URL", nullable = true, insertable = true, updatable = true, length = 128)
    public String getS3Url() {
        return s3Url;
    }

    public void setS3Url(String s3Url) {
        this.s3Url = s3Url;
    }

    @Basic
    @Column(name = "S3_KEY", nullable = true, insertable = true, updatable = true)
    public byte[] getS3Key() {
        return s3Key;
    }

    public void setS3Key(byte[] s3Key) {
        this.s3Key = s3Key;
    }

    @Basic
    @Column(name = "ATMOS_URL", nullable = true, insertable = true, updatable = true, length = 128)
    public String getAtmosUrl() {
        return atmosUrl;
    }

    public void setAtmosUrl(String atmosUrl) {
        this.atmosUrl = atmosUrl;
    }

    @Basic
    @Column(name = "ATMOS_KEY", nullable = true, insertable = true, updatable = true)
    public byte[] getAtmosKey() {
        return atmosKey;
    }

    public void setAtmosKey(byte[] atmosKey) {
        this.atmosKey = atmosKey;
    }

    @Basic
    @Column(name = "SSH_URL", nullable = true, insertable = true, updatable = true, length = 128)
    public String getSshUrl() {
        return sshUrl;
    }

    public void setSshUrl(String sshUrl) {
        this.sshUrl = sshUrl;
    }

    @Basic
    @Column(name = "SSH_KEY", nullable = true, insertable = true, updatable = true)
    public byte[] getSshKey() {
        return sshKey;
    }

    public void setSshKey(byte[] sshKey) {
        this.sshKey = sshKey;
    }

    @Basic
    @Column(name = "CIFS_URL", nullable = true, insertable = true, updatable = true, length = 128)
    public String getCifsUrl() {
        return cifsUrl;
    }

    public void setCifsUrl(String cifsUrl) {
        this.cifsUrl = cifsUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ConfEntity that = (ConfEntity) o;

        if (compression != that.compression) return false;
        if (confId != that.confId) return false;
        if (refreshRate != that.refreshRate) return false;
        if (!Arrays.equals(atmosKey, that.atmosKey)) return false;
        if (atmosUrl != null ? !atmosUrl.equals(that.atmosUrl) : that.atmosUrl != null) return false;
        if (cifsUrl != null ? !cifsUrl.equals(that.cifsUrl) : that.cifsUrl != null) return false;
        if (defaultRetentionDays != null ? !defaultRetentionDays.equals(that.defaultRetentionDays) : that.defaultRetentionDays != null)
            return false;
        if (destination != null ? !destination.equals(that.destination) : that.destination != null) return false;
        if (destinationType != null ? !destinationType.equals(that.destinationType) : that.destinationType != null)
            return false;
        if (format != null ? !format.equals(that.format) : that.format != null) return false;
        if (!Arrays.equals(s3Key, that.s3Key)) return false;
        if (s3Url != null ? !s3Url.equals(that.s3Url) : that.s3Url != null) return false;
        if (sourceDir != null ? !sourceDir.equals(that.sourceDir) : that.sourceDir != null) return false;
        if (!Arrays.equals(sshKey, that.sshKey)) return false;
        if (sshUrl != null ? !sshUrl.equals(that.sshUrl) : that.sshUrl != null) return false;
        if (timeDateStampFmt != null ? !timeDateStampFmt.equals(that.timeDateStampFmt) : that.timeDateStampFmt != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = confId;
        result = 31 * result + refreshRate;
        result = 31 * result + (destination != null ? destination.hashCode() : 0);
        result = 31 * result + (destinationType != null ? destinationType.hashCode() : 0);
        result = 31 * result + (sourceDir != null ? sourceDir.hashCode() : 0);
        result = 31 * result + compression;
        result = 31 * result + (format != null ? format.hashCode() : 0);
        result = 31 * result + (defaultRetentionDays != null ? defaultRetentionDays.hashCode() : 0);
        result = 31 * result + (timeDateStampFmt != null ? timeDateStampFmt.hashCode() : 0);
        result = 31 * result + (s3Url != null ? s3Url.hashCode() : 0);
        result = 31 * result + (s3Key != null ? Arrays.hashCode(s3Key) : 0);
        result = 31 * result + (atmosUrl != null ? atmosUrl.hashCode() : 0);
        result = 31 * result + (atmosKey != null ? Arrays.hashCode(atmosKey) : 0);
        result = 31 * result + (sshUrl != null ? sshUrl.hashCode() : 0);
        result = 31 * result + (sshKey != null ? Arrays.hashCode(sshKey) : 0);
        result = 31 * result + (cifsUrl != null ? cifsUrl.hashCode() : 0);
        return result;
    }
}
