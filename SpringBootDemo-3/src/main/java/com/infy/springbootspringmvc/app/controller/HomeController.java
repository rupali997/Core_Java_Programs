package com.infy.springbootspringmvc.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.infy.springbootspringmvc.app.model.Student;
import com.infy.springbootspringmvc.app.model.Trainer;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String prelogin() {
		return "adminSuccess";
	}

	@RequestMapping("/log")
	public String login(@RequestParam("username") String un, @RequestParam("password") String ps,
			@ModelAttribute Trainer t, @ModelAttribute Student s, Model m) {
		System.out.println("In Login page!!!!");
		System.out.println("UserName : " + un);
		System.out.println("Password : " + ps);

		if ("admin".equalsIgnoreCase(un) && "admin@123".equalsIgnoreCase(ps)) {

			t.setTid(401);
			t.setName("Onkar Borkar");
			t.setUsername("onkarb");
			t.setPassword("ob@123");

			Trainer t1 = new Trainer();
			t1.setTid(402);
			t1.setName("Jivan Raut");
			t1.setUsername("jivanr");
			t1.setPassword("jr@123");

			List<Trainer> lis = new ArrayList<>();
			lis.add(t);
			lis.add(t1);

			m.addAttribute("tlist", lis);

			return "trainerSuccess";
		} else if ("trainer".equalsIgnoreCase(un) && "trainer@123".equalsIgnoreCase(ps)) {

			s.setSid(11);
			s.setName("Rupali Borkar");
			s.setUsername("rupalib");
			s.setPassword("rb@123");

			Student s1 = new Student();
			s1.setSid(12);
			s1.setName("Kalash Borkar");
			s1.setUsername("kalashb");
			s1.setPassword("kb@123");

			List<Student> lis = new ArrayList<>();
			lis.add(s);
			lis.add(s1);

			m.addAttribute("slist", lis);

			return "studentSuccess";

		}

		else if ("student".equalsIgnoreCase(un) && "student@123".equalsIgnoreCase(ps)) {

			s.setSid(101);
			s.setName("Mahi Vij");
			s.setUsername("mahiv");
			s.setPassword("mv@123");

			Student s1 = new Student();
			s1.setSid(102);
			s1.setName("Jiya Manik");
			s1.setUsername("jiyam");
			s1.setPassword("jm@123");

			List<Student> lis = new ArrayList<>();
			lis.add(s);
			lis.add(s1);

			m.addAttribute("slist", lis);

			return "studentSuccess";

		}

		return null;
	}
}
