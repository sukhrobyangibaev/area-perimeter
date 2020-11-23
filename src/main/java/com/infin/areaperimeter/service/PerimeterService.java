package com.infin.areaperimeter.service;

import com.infin.areaperimeter.model.Rectangle;
import com.infin.areaperimeter.model.Triangle;
import com.infin.areaperimeter.model.Circle;
import com.infin.areaperimeter.model.Square;
import org.springframework.stereotype.Repository;

@Repository
public interface PerimeterService {

    String getPerimeter(Square square);

    String getPerimeter(Rectangle rectangle);

    String getPerimeter(Triangle triangle);

    String getPerimeter(Circle circle);
}
