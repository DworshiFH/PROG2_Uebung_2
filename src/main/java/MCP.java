import trafficlight.ctrl.TrafficLightCtrl;
import trafficlight.gui.Observer;
import trafficlight.gui.TrafficLightGui;
import trafficlight.states.State;


public class MCP {
    public static void main(String[] args) {

        TrafficLightCtrl ctrl = TrafficLightCtrl.getInstance();
        ctrl.run();

    }
}