package study.thyemeleaflayoutstudy1.domain.vo;

import lombok.Data;

@Data
public class UserVO {
    private int userSeq;
    private String userId;
    private String userPassword;
    private String userName;
    private String userBirth;
    private String userPhone;
    private String userLevel;
    private String regDate;
    private String upateDate;

    public UserVO(String userId, String userPassword, String userName, String userBirth, String userPhone, String userLevel) {
        this.userId = userId;
        this.userPassword = userPassword;
        this.userName = userName;
        this.userBirth = userBirth;
        this.userPhone = userPhone;
        this.userLevel = userLevel;
    }
}
