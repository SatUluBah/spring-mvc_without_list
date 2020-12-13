package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    private List<Car> list = new CarServiceImpl().getCarList();


    @GetMapping(value ="/cars")
    public String showCarList(ModelMap model, @RequestParam(value = "count", defaultValue = "6") Integer count) {
        List<Car> cars = new ArrayList<>();
        if(count > 0 && count <=5) {
            for(int i = 0; i < count; i++) {
                cars.add(list.get(i));
            }
        } else if (count > 5) {
            cars = list;
        }
        model.addAttribute("cars", cars);
        return "cars";
    }

}

