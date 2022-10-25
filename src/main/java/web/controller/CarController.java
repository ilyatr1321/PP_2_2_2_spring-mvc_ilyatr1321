package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.DaoCars.CarsDao;
import web.services.CarService;

@Controller
public class CarController {

    private final CarsDao carsDao;

    public CarController(CarsDao carsDao) {
        this.carsDao = carsDao;
    }


    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count",required = false,defaultValue = "5") int count, Model model) {
        model.addAttribute("sff",carsDao.getCars(count));
        return "cars";
    }
}