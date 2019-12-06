package com.gsport.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gsport.app.models.User;
import com.gsport.app.repositories.UserDAO;

@Controller
public class UserController {

	@Autowired
	UserDAO userDao;

	
	@ModelAttribute("user")
    public User userRegistrationDto() {
        return new User();
    }
	
	

	/****** Find a user by his/her email ******/
	public User findByEmail(String email) {
		return userDao.findByEmail(email);
	}

	/****** Method for user registration ******/
	public User save(User registration) {
		User user = new User();
		user.setName(registration.getName());
		user.setEmail(registration.getEmail());
		user.setPassword(registration.getPassword());
		user.setUserType(registration.getUserType());
		return userDao.save(user);
	}
	

	/****** Login Validation ******/
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@ModelAttribute(name = "loginForm") User user, Model model) {
		
		String email = user.getEmail();
		String password = user.getPassword();

		List<User> users = this.Get();

		for (User u : users) {
			if (u.getEmail().equals(email) && u.getPassword().equals(password)) {

				return "home";
			}
		}

		// if user email or password is wrong
		model.addAttribute("invalidCredentials", true);
		return "login";
	}
	
	@PostMapping(value="/signup")
    public String registerUserAccount(@ModelAttribute("user") @Valid User user,
        BindingResult result) {

        User existing = userDao.findByEmail(user.getEmail());
        if (existing != null) {
            result.rejectValue("email", null, "There is already an account registered with that email");
        }

        if (result.hasErrors()) {
            return "registration";
        }

        userDao.save(user);
        return "redirect:/registration?success";
    }

	@RequestMapping(value = "/editProfile", method = RequestMethod.GET)
	public String editProfile() {
		/* Return HTML name page */
		return "editProfile";
	}

	@RequestMapping(value = "/consultEvent", method = RequestMethod.GET)
	public String consultEvent() {
		/* Return HTML name page */
		return "consultEvent";
	}

	/* Method for list users in system */
	public List<User> Get() {
		return userDao.findAll();
	}
}
