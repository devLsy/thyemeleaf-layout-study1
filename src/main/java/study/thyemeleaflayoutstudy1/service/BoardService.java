package study.thyemeleaflayoutstudy1.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import study.thyemeleaflayoutstudy1.domain.vo.BoardVO;
import study.thyemeleaflayoutstudy1.mapper.BoardMapper;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
@Transactional(readOnly = true)
public class BoardService {

    private final BoardMapper boardMapper;

    public List<BoardVO> findBoardList() {
        return boardMapper.findBoardList();
    }

    public BoardVO findBoardDetail(int boardSeq) {
        return boardMapper.findBoardDetail(boardSeq);
    }

    public int findBoardCount() {
        return boardMapper.findBoardCount();
    }

    @Transactional
    public void insertBoardContent(BoardVO boardVO) throws Exception{
        boardMapper.insertBoardContent(boardVO);
    }

    @Transactional
    public void updateBoardContent(int boardSeq, BoardVO boardVO) throws Exception{
        boardMapper.updateBoardContent(boardSeq, boardVO);
    }

    @Transactional
    public void deleteBoardContent(int boardSeq) throws Exception{
        boardMapper.deleteBoardContent(boardSeq);
    }

}
