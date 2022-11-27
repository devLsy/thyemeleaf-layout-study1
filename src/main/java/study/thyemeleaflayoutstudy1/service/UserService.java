package study.thyemeleaflayoutstudy1.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import study.thyemeleaflayoutstudy1.domain.vo.UserVO;
import study.thyemeleaflayoutstudy1.mapper.UserMapper;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class UserService {

    private final UserMapper userMapper;

    public List<UserVO> findUserList() {
        return userMapper.findUserList();
    }
}
