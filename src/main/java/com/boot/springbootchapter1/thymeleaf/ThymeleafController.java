package com.boot.springbootchapter1.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping
public class ThymeleafController {

    @GetMapping("/index")
    public ModelAndView index() {
        ModelAndView view = new ModelAndView();
        view.setViewName("index");
        view.addObject("title", "first thymeleaf web view");
        view.addObject("desc", "welcome to");
        Author author = new Author();
        author.setAge(11);
        author.setName("66");
        view.addObject("author",author);
        return view;
    }

    @GetMapping("/index1")
    public String index1(HttpServletRequest request) {
        request.setAttribute("title", "httpsevletRequest");
        request.setAttribute("desc", "write by request");
        Author author = new Author();
        author.setAge(22);
        author.setName("hihi");
        request.setAttribute("author", author);
        return "index";
    }

    class Author {
        private int age;
        private String name;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
