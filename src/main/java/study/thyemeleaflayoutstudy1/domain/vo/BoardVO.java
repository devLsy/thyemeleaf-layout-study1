package study.thyemeleaflayoutstudy1.domain.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BoardVO {
    private int boardSeq;
    private String title;
    private String contents;
    private String name;
    private String regDate;
    private String updateDate;

    public BoardVO(String title, String contents, String name) {
        this.title = title;
        this.contents = contents;
        this.name = name;
    }
}
