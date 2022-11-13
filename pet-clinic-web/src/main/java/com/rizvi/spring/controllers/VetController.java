package com.rizvi.spring.controllers;


import com.rizvi.spring.StringConstants;
import com.rizvi.spring.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vets")
public class VetController {

    private final VetService vetService;
    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets","/vets/index","/vets/vet.html","/vets.html"})
    public String listVets(Model model) {
        model.addAttribute(StringConstants.APP_NAME_ATTR, StringConstants.APPLICATION_NAME);
        model.addAttribute("vetHeading", "Vets View");
        model.addAttribute("vets",vetService.findAll());
        return "vets/index";
    }
}
