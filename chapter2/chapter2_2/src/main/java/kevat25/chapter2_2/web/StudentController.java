package kevat25.chapter2_2.web;

import kevat25.chapter2_2.domain.Student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

    @RequestMapping("/hello")
    public String returnHello(Model model) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Kate", "Cole"));
        students.add(new Student("Dan", "Brown"));
        students.add(new Student("Mike", "Mars"));

        model.addAttribute("students", students);

        return "studentlist";
    }
}
