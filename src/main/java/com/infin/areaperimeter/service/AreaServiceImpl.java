package com.infin.areaperimeter.service;

import com.infin.areaperimeter.model.Rectangle;
import com.infin.areaperimeter.model.Triangle;
import com.infin.areaperimeter.model.Circle;
import com.infin.areaperimeter.model.Square;
import org.springframework.stereotype.Service;

@Service
public class AreaServiceImpl implements AreaService {

    @Override
    public String getArea(Square square) {
        double squareArea = square.getA() * square.getA();
        return String.valueOf(squareArea);
    }

    @Override
    public String getArea(Rectangle rectangle) {
        double squareArea = rectangle.getA() * rectangle.getB();
        return String.valueOf(squareArea);
    }

    @Override
    public String getArea(Triangle triangle) {
        double s = (triangle.getA() + triangle.getB() + triangle.getC()) / 2;
        double squareArea = Math.sqrt(s * (s - triangle.getA()) * (s - triangle.getB()) * (s - triangle.getC()));
        return String.valueOf(squareArea);
    }

    @Override
    public String getArea(Circle circle) {
        double squareArea = Math.PI * circle.getR() * circle.getR();
        return String.valueOf(squareArea);
    }
}
