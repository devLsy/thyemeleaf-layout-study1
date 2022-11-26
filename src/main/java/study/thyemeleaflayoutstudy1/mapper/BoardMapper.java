package study.thyemeleaflayoutstudy1.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import study.thyemeleaflayoutstudy1.domain.vo.BoardVO;

import java.util.List;

@Repository @Mapper
public interface BoardMapper {

    List<BoardVO> findBoardList();

    BoardVO findBoardDetail(int boardSeq);

    int findBoardCount();

    void insertBoardContent(BoardVO boardVO);

    void updateBoardContent(int boardSeq, BoardVO boardVO);

    void deleteBoardContent(int boardSeq);



}
