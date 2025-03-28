package meber;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@NoArgsConstructor
@ToString
@Getter
@Setter
@AllArgsConstructor

public class MemberDTO {
    private int no;
    private String id;
    private String Name;
    private String addr;
    private String email;
    private int age;
    private int remark;

}
