package select.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//  ~~~DTO : Data Transfer OBject -메소드에서 데이터를 담아서 전달하는 객체
// ~~~~ DAO : Data Access Object - DB 작업을 모아놓은 객체

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class DeptDTO {
    private int deptno;
    private String dame;
    private String loc;
}
