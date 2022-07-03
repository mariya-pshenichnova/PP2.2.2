package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import web.dao.CarDAO;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    private final CarDAO carDAO;

    @Autowired
    public CarController(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @GetMapping("/cars")
    public String printCars(Model model) {
        model.addAttribute("cars", carDAO.printCars());
        return "/cars";
    }

    @GetMapping("/get")
    public String getCarsById(@PathVariable("id") int id, Model model) {
        model.addAttribute("cars", carDAO.getCarsById(id));
        return "cars/get";
    }

}
