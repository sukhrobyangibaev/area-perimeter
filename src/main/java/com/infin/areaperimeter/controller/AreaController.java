package com.infin.areaperimeter.controller;

import com.infin.areaperimeter.model.Circle;
import com.infin.areaperimeter.model.Rectangle;
import com.infin.areaperimeter.model.Square;
import com.infin.areaperimeter.model.Triangle;
import com.infin.areaperimeter.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/area")
public class AreaController {

    @Autowired
    AreaService areaService;

    @GetMapping(params = "a")
    @ResponseBody
    public String getAreaOfSquare(@RequestParam(name = "a", required = false, defaultValue = "0") double a) {
        if (a <= 0)
            return "wrong sizes";
        Square square = new Square(a);
        return areaService.getArea(square);
    }

    @GetMapping(params = "r")
    @ResponseBody
    public String getAreaOfCircle(@RequestParam(name = "r", required = false, defaultValue = "0") double r) {
        if (r <= 0)
            return "wrong sizes";
        Circle circle = new Circle(r);
        return areaService.getArea(circle);
    }

    @GetMapping(params = {"a", "b"})
    @ResponseBody
    public String getAreaOfRectangle(@RequestParam(name = "a", required = false, defaultValue = "0") double a,
                                     @RequestParam(name = "b", required = false, defaultValue = "0") double b) {
        if (a <= 0 || b <= 0)
            return "wrong sizes";
        Rectangle rectangle = new Rectangle(a, b);
        return areaService.getArea(rectangle);
    }

    @GetMapping(params = {"a", "b", "c"})
    @ResponseBody
    public String getAreaOfTriangle(@RequestParam(name = "a", required = false, defaultValue = "0") double a,
                                    @RequestParam(name = "b", required = false, defaultValue = "0") double b,
                                    @RequestParam(name = "c", required = false, defaultValue = "0") double c) {
        if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a)
            return "wrong sizes";
        Triangle triangle = new Triangle(a, b, c);
        return areaService.getArea(triangle);
    }

}
