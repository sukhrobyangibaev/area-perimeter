package com.infin.areaperimeter.service;


import com.infin.areaperimeter.model.Circle;
import com.infin.areaperimeter.model.Rectangle;
import com.infin.areaperimeter.model.Square;
import com.infin.areaperimeter.model.Triangle;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class AreaServiceTests {

    @Autowired
    AreaService areaService;

    @Test
    void testSquare() {
        Square square = new Square(3);
        assertEquals("9.0", areaService.getArea(square));
        square.setA(5);
        assertEquals("25.0", areaService.getArea(square));
    }

    @Test
    void testCircle() {
        Circle circle = new Circle(3);
        assertEquals("28.274333882308138", areaService.getArea(circle));
        circle.setR(5);
        assertEquals("78.53981633974483", areaService.getArea(circle));
    }

    @Test
    void testRectangle() {
        Rectangle rectangle = new Rectangle(3, 5);
        assertEquals("15.0", areaService.getArea(rectangle));
    }

    @Test
    void testTriangle() {
        Triangle triangle = new Triangle(3, 3, 2);
        assertEquals("2.8284271247461903", areaService.getArea(triangle));
    }
}
