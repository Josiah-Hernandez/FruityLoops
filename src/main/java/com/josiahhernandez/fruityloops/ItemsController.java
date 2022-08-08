package com.josiahhernandez.fruityloops;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.josiahhernandez.fruityloops.models.Item;

@Controller
public class ItemsController {
	@RequestMapping("/")
	public String Index(Model model) {
		ArrayList<Item> fruits = new ArrayList<Item>();
    	ArrayList<Item> price = new ArrayList<Item>();
        	
        fruits.add(new Item("Kiwi", 1.5));
        fruits.add(new Item("Mango", 2.0));
        fruits.add(new Item("Goji Berries", 4.0));
        fruits.add(new Item("Guava", .75));
        
        for(Item newFruits : fruits) {
        	System.out.println(newFruits);
        }
//        // Add fruits your view model here
        model.addAttribute("fruits", fruits);
		return "Index.jsp";
		
	}

}
