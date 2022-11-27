package study.thyemeleaflayoutstudy1.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import study.thyemeleaflayoutstudy1.domain.vo.UserVO;
import study.thyemeleaflayoutstudy1.service.UserService;

import java.util.List;

@Controller
@Slf4j
@RequestMapping(value = "users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping(value = "list")
    public String findUserList(Model model) {
        List<UserVO> userList = userService.findUserList();
        model.addAttribute("userList", userList);
        return "user/user_list";
    }
}
