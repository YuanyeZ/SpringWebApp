package com.ted.Controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ted.Model.Camera;
import com.ted.Model.User;
import com.ted.service.CameraService;
import com.ted.service.UserService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	private UserService userService;
	private CameraService cameraService;
	
	@Autowired(required=true)
	@Qualifier(value="userService")
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Autowired(required=true)
	@Qualifier(value="cameraService")
	public void setCameraService(CameraService cameraService) {
		this.cameraService = cameraService;
	}
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage(Locale locale, Model model) {
        return "login";
    }
	
	@RequestMapping(value = "/about", method = RequestMethod.GET)
    public String about(Locale locale, Model model) {
        return "about";
    }
	
	@RequestMapping(value = "/brands", method = RequestMethod.GET)
    public String brands(Locale locale, Model model) {
		List<Camera> cameraList = this.cameraService.getAllUsers();
		Set<String> brandsList = new HashSet<String>();
		
		for(Camera cam : cameraList){
			if(!brandsList.contains(cam.getBrands())){
				brandsList.add(cam.getBrands());
			}
		}
		
		model.addAttribute("cameraList", cameraList);
		model.addAttribute("brandsList", brandsList);
		
        return "brands";
    }
    /*******************
     * 
     * 
     * 
    ************************************/
        
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String listUsers(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("listUsers", this.userService.getAllUsers());
        return "user";
    }
    
  //For add and update user both
    @RequestMapping(value= "/users/add", method = RequestMethod.POST)
    public String addPerson(@ModelAttribute("user") User u){
         
        if(u.getID() == 0){
            //new user, add it
            this.userService.addUser(u);
        }else{
            //existing user, call update
            this.userService.updateUser(u);
        }
         
        return "redirect:/users";
         
    }
     
    @RequestMapping("/remove/{id}")
    public String removePerson(@PathVariable("id") int id){
         
        this.userService.deleteUser(id);
        return "redirect:/users";
    }
  
    @RequestMapping("/edit/{id}")
    public String editPerson(@PathVariable("id") int id, Model model){
        model.addAttribute("user", this.userService.getUserById(id));
        model.addAttribute("listUsers", this.userService.getAllUsers());
        return "user";
    }
    
	
}
