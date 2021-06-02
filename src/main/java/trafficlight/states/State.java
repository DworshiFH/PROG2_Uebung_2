package trafficlight.states;

//TODO implement a part of the pattern here
//no need to add any code here

public abstract class State {

    public abstract State getNextState();

    public abstract String getColor();
}