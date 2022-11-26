package study.thyemeleaflayoutstudy1.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;
import study.thyemeleaflayoutstudy1.domain.vo.BoardVO;

import java.util.List;

@SpringBootTest
@Slf4j
@Transactional
class BoardServiceTest {

    @Autowired BoardService boardService;

    @Test
    @DisplayName("저장테스트")
    @Commit
    public void 저장테스트() throws Exception {
        //givin
//        for (int i = 0; i < 100; i++) {
//            BoardVO boardVO = new BoardVO("제목", "내용", "작성자");
//            boardService.insertBoardContent(boardVO);
//        }
            BoardVO boardVO = new BoardVO("제목", "내용", "작성자");
            boardService.insertBoardContent(boardVO);
        //when

        //then
    }

    @Test
    @DisplayName("목록조회")
    @Commit
    public void 목록조회() throws Exception {
        //givin
        List<BoardVO> boardList = boardService.findBoardList();
        //when

        //then
    }

    @Test
    @DisplayName("단건조회")
    @Commit
    public void 단건조회() throws Exception {
        //givin
        boardService.findBoardDetail(0);

        //when

        //then
    }

    @Test
    @DisplayName("수정테스트")
    @Commit
    public void 수정테스트() throws Exception {
        //givin
        BoardVO boardVO = new BoardVO("핑거스냅", "핑거스냅", "타노스");
        boardService.updateBoardContent(0, boardVO);
        //when

        //then
    }

    @Test
    @DisplayName("delTest")
    @Commit
    public void delTest() throws Exception {
        //givin
        boardService.deleteBoardContent(0);
        //when

        //then
    }

}