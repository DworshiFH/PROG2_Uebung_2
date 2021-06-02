package trafficlight.gui;


import trafficlight.states.State;

import java.awt.*;

public class TrafficLight extends Light {

    public TrafficLight(Color color) {
        super(color);
    }

    public void turnOn(boolean a) {
        isOn = a;
        repaint();
    }

    public boolean isOn() {
        return isOn;
    }

    //TODO implement a part of the pattern here
    //no need to add any code here
}
