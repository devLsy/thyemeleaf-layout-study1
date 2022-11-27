package study.thyemeleaflayoutstudy1.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import study.thyemeleaflayoutstudy1.domain.vo.UserVO;

import java.util.List;

@Repository @Mapper
public interface UserMapper {

    List<UserVO> findUserList();
}
