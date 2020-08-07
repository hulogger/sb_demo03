package group1.sb_demo03.controller;

import group1.sb_demo03.domain.Students;
import group1.sb_demo03.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
/*@CrossOrigin*/
public class StudentsController {

    @Autowired
    private StudentsService studentsService;
    @RequestMapping("/getStudents")
    public String getStudents(Model model){
        List<Students> studentsList = studentsService.getAllStudents();
        model.addAttribute("studentsList",studentsList);
        return "index";
    }

    @RequestMapping("/getStudentsData")
    @ResponseBody
    public List<Students> getStudentsData(){
        List<Students> studentsList = studentsService.getAllStudents();
        return studentsList;
    }

    @RequestMapping("/delStudents")
    public String delStudents(Integer xh,Model model){
        int i = studentsService.delStudent(xh);
        if (i>0){
            model.addAttribute("del","删除成功");
        }else {
            model.addAttribute("del","删除失败");
        }
        return "redirect:getStudents";
    }
}
