package com.pahlsoft.logfarm.entity;

import javax.persistence.*;

/**
 * Created by aj on 4/6/14.
 */
@Entity
@Table(name = "schedule", schema = "", catalog = "logfarm")
public class ScheduleEntity {
    private int scheduleId;
    private String time;
    private String job;
    private String task;
    private String comment;

    @Id
    @Column(name = "SCHEDULE_ID", nullable = false, insertable = true, updatable = true)
    public int getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(int scheduleId) {
        this.scheduleId = scheduleId;
    }

    @Basic
    @Column(name = "TIME", nullable = false, insertable = true, updatable = true, length = 45)
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Basic
    @Column(name = "JOB", nullable = false, insertable = true, updatable = true, length = 45)
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Basic
    @Column(name = "TASK", nullable = false, insertable = true, updatable = true, length = 45)
    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Basic
    @Column(name = "COMMENT", nullable = false, insertable = true, updatable = true, length = 45)
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ScheduleEntity that = (ScheduleEntity) o;

        if (scheduleId != that.scheduleId) return false;
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;
        if (job != null ? !job.equals(that.job) : that.job != null) return false;
        if (task != null ? !task.equals(that.task) : that.task != null) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = scheduleId;
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (job != null ? job.hashCode() : 0);
        result = 31 * result + (task != null ? task.hashCode() : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        return result;
    }
}
