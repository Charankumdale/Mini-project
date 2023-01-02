package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.example.entity.Contact;
import com.example.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository contactRepo;

	@Override
	public boolean saveContact(Contact contact) {

		Contact save = contactRepo.save(contact);

		if (save != null) {
			return true;
		}
		return false;
	}

	;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
	
	@Override
	public List<Contact> getAllContacts() {
		
		Contact c = new Contact();
		c.setActiveSwitch('Y');
		
		Example<Contact> ex = Example.of(c);
		List<Contact> findAll2 = contactRepo.findAll(ex);
		
		

	//	List<Contact> findAll = contactRepo.findAll();
		
		return findAll2;
	}

	;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
	
	@Override
	public Contact getContactById(Integer contactId) {

		Optional<Contact> findById = contactRepo.findById(contactId);

		if (findById.isPresent()) {
			Contact contact = findById.get();

			return contact;
		}

		return null;

	}

	;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
	
	@Override
	public boolean deleteContactById(Integer contactId) {

		boolean status = contactRepo.existsById(contactId);
		
		if (status) {
//			contactRepo.deleteById(contactId);
			Optional<Contact> byId = contactRepo.findById(contactId);
			
			if(byId.isPresent()) {
				Contact contact = byId.get();
				contact.setActiveSwitch('N');
				contactRepo.save(contact);
			}
			
			return true;
		}

		return false;
	}

	;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
	
	

}
