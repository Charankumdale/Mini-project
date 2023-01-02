package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.entity.Contact;
import com.example.service.ContactServiceImpl;

@Controller
public class IndexController {

	@Autowired
	private ContactServiceImpl contServImpl;

	@GetMapping("/contact")
	public String loadContactForm(Model model) {

		Contact c = new Contact();

		model.addAttribute("contact", c);

		return "contactInfo";
	}

	@PostMapping("/saveContact")
	public String saveContact(Contact contact, Model mod) {


		if(contact.getActiveSwitch()=='Y') {
			if (contact.getContactName() != "" & contact.getContactEmail() != "" & contact.getContactNo() != null) {
				
				boolean saveContact = contServImpl.saveContact(contact);
				mod.addAttribute("y", "* Contact saved successfully..! *");
				System.out.println(contact);
				
			}else {
				mod.addAttribute("n", "* Fill all details...! *");
			}
		}else {
			mod.addAttribute("a", "* Active Switch disabled... *");
		}
		
		return "contactInfo";
	}

	@GetMapping("/getcontacts")
	public String contactInfo(Model mod) {

		List<Contact> allContacts = contServImpl.getAllContacts();

		mod.addAttribute("ms", allContacts);

		return "allContacts";
	}

	@GetMapping("/edit")
	public String editInfo(@RequestParam Integer contactId , Model mod) {
		
		Contact contact = contServImpl.getContactById(contactId);
	
		mod.addAttribute("contact", contact);
		
		return "contactInfo";	
	}
	
	@GetMapping("/delete")
	public String deleteContact(@RequestParam Integer contactId, Model mod) {

		contServImpl.deleteContactById(contactId);

		List<Contact> list = contServImpl.getAllContacts();

		mod.addAttribute("ms", list);

		return "allContacts";
	}
}
