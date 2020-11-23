package com.infin.areaperimeter.service;

import com.infin.areaperimeter.model.Rectangle;
import com.infin.areaperimeter.model.Triangle;
import com.infin.areaperimeter.model.Circle;
import com.infin.areaperimeter.model.Square;
import org.springframework.stereotype.Repository;

@Repository
public interface AreaService {

    String getArea(Square square);

    String getArea(Rectangle rectangle);

    String getArea(Triangle triangle);

    String getArea(Circle circle);
}
