package com.infin.areaperimeter.service;

import com.infin.areaperimeter.model.Rectangle;
import com.infin.areaperimeter.model.Triangle;
import com.infin.areaperimeter.model.Circle;
import com.infin.areaperimeter.model.Square;
import org.springframework.stereotype.Service;

@Service
public class PerimeterServiceImpl implements PerimeterService {

    @Override
    public String getPerimeter(Square square) {
        double perimeter = square.getA() * 4;
        return String.valueOf(perimeter);

    }

    @Override
    public String getPerimeter(Rectangle rectangle) {
        double perimeter = (rectangle.getA() + rectangle.getB()) * 2;
        return String.valueOf(perimeter);
    }

    @Override
    public String getPerimeter(Triangle triangle) {
        double perimeter = triangle.getA() + triangle.getB() + triangle.getC();
        return String.valueOf(perimeter);
    }

    @Override
    public String getPerimeter(Circle circle) {
        double perimeter = 2 * Math.PI * circle.getR();
        return String.valueOf(perimeter);
    }
}
