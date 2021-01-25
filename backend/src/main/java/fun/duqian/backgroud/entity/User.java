package fun.duqian.backgroud.entity;

import lombok.Data;

import java.sql.Timestamp;
import java.util.Date;

/**
 * @author mark
 */
@Data
public class User {

    /**
     * key
     */
    private Long id;
    /**
     * gender of user 0-unset 1-male 2-female
     */
    private Integer gender;

    /**
     * user name for login
     */
    private String username;

    /**
     * password in MD5 with salt
     */
    private String authKey;

    /**
     * user nickname
     */
    private String nickname;

    /**
     * user real name
     */
    private String realName;

    /**
     * user head portrait url
     */
    private String avatarUrl;

    /**
     * user mobile phone number in
     */
    private String mobile;

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
