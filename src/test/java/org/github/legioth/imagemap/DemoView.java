package org.github.legioth.imagemap;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.router.Route;

@Route("")
public class DemoView extends Div {

    public DemoView() {
        ImageMap imageMap = new ImageMap();
        imageMap.setSrc("https://vaadin.com/images/trademark/PNG/VaadinLogomark_RGB_1000x1000.png");

        imageMap.setHoverBackground("rgba(0,0,0,0.4)");
        imageMap.setAreaBorder("1px dashed grey");
        imageMap.setHoverBorder("2px solid black");

        imageMap.addArea(99, 115, 400, 316).setTitle("Left antler").setHoverBackground("rgba(0,0,0,0.6)")
                .addClickListener(event -> Notification.show("Left antler"));
        imageMap.addArea(499, 115, 400, 316).setTitle("Right antler")
                .addClickListener(event -> Notification.show("Right antler"));
        imageMap.addArea(280, 468, 433, 417).setTitle("Nose").setBackground("rgba(0,0,0,0.2)").setBorder("none")
                .setHoverBorder("2px dotted black").addClickListener(event -> Notification.show("Nose"));

        add(imageMap);
    }

}
