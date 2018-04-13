package com.example.demo.controller;

import com.example.demo.repository.VehicleRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class ExampleController {

    private VehicleRepository vehicleRepository;

    public ExampleController(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @RequestMapping("/helloWorld")
    public ModelAndView helloWorld() {
        Map<String,String> map = new HashMap<>();
        map.put("userName", vehicleRepository.getOne(1L).getVehicleType());
        ModelAndView index = new ModelAndView("index");
        index.addObject("userName", "Piotr Serwatka");
        return index;
    }

}
