package group1.sb_demo03;


import group1.sb_demo03.dao.StudentsMapper;
import group1.sb_demo03.domain.Students;
import group1.sb_demo03.domain.StudentsExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SbDemo03ApplicationTests {

    @Autowired
private StudentsMapper studentsMapper;
    @Test
    public void contextLoads() {
        List<Students> list = studentsMapper.selectByExample(new StudentsExample());
        System.out.println("总共查询到多少行"+list.size());
    }

}
