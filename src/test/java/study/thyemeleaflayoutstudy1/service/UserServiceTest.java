package study.thyemeleaflayoutstudy1.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;
import study.thyemeleaflayoutstudy1.domain.vo.UserVO;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
@Transactional
class UserServiceTest {

    @Autowired UserService userService;

    @Test
    @DisplayName("findUserList")
    @Commit
    public void findUserList() throws Exception {
        //givin
        List<UserVO> userList = userService.findUserList();
        //when

        //then
    }

}