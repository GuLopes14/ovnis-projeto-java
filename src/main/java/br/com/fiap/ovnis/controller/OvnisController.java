package br.com.fiap.ovnis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.fiap.ovnis.model.Ovnis;
import br.com.fiap.ovnis.service.OvnisService;
import jakarta.validation.Valid;



@Controller
@RequestMapping("/ovnis")
public class OvnisController {
    private final OvnisService service;

    public OvnisController(OvnisService service) {
        this.service = service;
    }

    @GetMapping
    public String index(Model model) {
        model.addAttribute("registros", service.getAll());
        model.addAttribute("ovnis", new Ovnis());
        return "index";
    }

    @PostMapping
    public String add(@Valid @ModelAttribute("ovnis") Ovnis ovnis, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("registros", service.getAll());
            return "index";
        }
        service.save(ovnis);
        return "redirect:/ovnis";
    }
    
    
}
