import Manager.SimulationManager;

public class Main {
    public static void main(String[] args) {
        SimulationManager simulationManager = new SimulationManager();
        simulationManager.initHotel();
        simulationManager.simulate(31);
        simulationManager.mainMenu();
    }
}