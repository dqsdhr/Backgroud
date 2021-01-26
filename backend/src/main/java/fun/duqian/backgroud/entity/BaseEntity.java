package fun.duqian.backgroud.entity;

import lombok.Data;

import java.sql.Timestamp;
import java.util.Date;

/**
 * @author mark
 */
public class BaseEntity {
    /**
     * data create time
     */
    private Date createTime;

    /**
     * data update time
     */
    private Date updateTime;

    /**
     * dba use
     */
    private Timestamp timestamp;
}
