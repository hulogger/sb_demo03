package group1.sb_demo03.service.impl;

import group1.sb_demo03.dao.StudentsMapper;
import group1.sb_demo03.domain.Students;
import group1.sb_demo03.domain.StudentsExample;
import group1.sb_demo03.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsServiceImpl implements StudentsService {
    @Autowired(required = false)
    private StudentsMapper studentsMapper;

    @Override
    public List<Students> getAllStudents() {
        return studentsMapper.selectByExample(new StudentsExample());
    }

    @Override
    public int delStudent(Integer xh) {
        return studentsMapper.deleteByPrimaryKey(xh);
    }
}
