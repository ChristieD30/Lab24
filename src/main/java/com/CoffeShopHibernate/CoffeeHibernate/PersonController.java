package com.CoffeShopHibernate.CoffeeHibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.CoffeShopHibernate.CoffeeHibernate.Repository.ItemsRepository;
import com.CoffeShopHibernate.CoffeeHibernate.Repository.PersonRepository;
import com.CoffeShopHibernate.CoffeeHibernate.entity.Person;

@Controller
public class PersonController {
	
	@Autowired
	ItemsRepository item;
	PersonRepository p;
	
	@RequestMapping("/")
	public ModelAndView index(){
	
			return new ModelAndView("index", "items", item.findAll());
		}
	
	@RequestMapping("/addperson")
	public ModelAndView addNewPerson(@RequestParam("pname") String name, @RequestParam("pemail") String email,@RequestParam("pphone") String phone,@RequestParam("ppassword") String password)  {
		
		Person p1 = new Person(name, email, phone, password);
		
		p.save(p1);
		
		
		return new ModelAndView( "redirect:/");
	}
	
	
	}


