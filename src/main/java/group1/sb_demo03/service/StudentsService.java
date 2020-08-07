package group1.sb_demo03.service;

import group1.sb_demo03.domain.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentsService {
    List<Students> getAllStudents();

    int delStudent(Integer xh);
}
