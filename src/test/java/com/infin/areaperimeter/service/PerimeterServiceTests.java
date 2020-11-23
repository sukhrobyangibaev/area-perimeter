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
public class PerimeterServiceTests {

    @Autowired
    PerimeterService perimeterService;

    @Test
    void testSquare() {
        Square square = new Square(3);
        assertEquals("12.0", perimeterService.getPerimeter(square));
        square.setA(5);
        assertEquals("20.0", perimeterService.getPerimeter(square));
    }

    @Test
    void testCircle() {
        Circle circle = new Circle(3);
        assertEquals("18.84955592153876", perimeterService.getPerimeter(circle));
        circle.setR(5);
        assertEquals("31.41592653589793", perimeterService.getPerimeter(circle));
    }

    @Test
    void testRectangle() {
        Rectangle rectangle = new Rectangle(3, 5);
        assertEquals("16.0", perimeterService.getPerimeter(rectangle));
    }

    @Test
    void testTriangle() {
        Triangle triangle = new Triangle(3, 3, 2);
        assertEquals("8.0", perimeterService.getPerimeter(triangle));
    }
}
