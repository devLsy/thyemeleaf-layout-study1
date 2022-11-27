package study.thyemeleaflayoutstudy1.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import study.thyemeleaflayoutstudy1.domain.vo.BoardVO;
import study.thyemeleaflayoutstudy1.service.BoardService;

import java.util.List;

@Controller
@RequiredArgsConstructor
@Slf4j
@RequestMapping(value = "board")
public class BoardController {

    private final BoardService boardService;

    @GetMapping(value = "/list")
    public String list(Model model) {
        List<BoardVO> boardList = boardService.findBoardList();
        model.addAttribute("boardList", boardList);
        return "board/board_list";
    }
}
