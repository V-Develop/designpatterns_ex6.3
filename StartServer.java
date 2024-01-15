public class StartServer implements ServerSwitch {

    private ScheduleServer scheduleServer;

    public StartServer(ScheduleServer scheduleServer) {
        this.scheduleServer = scheduleServer;
    }

    @Override
    public void toggleServer() {
        scheduleServer.startBooting();
        scheduleServer.readSystemConfigFile();
        scheduleServer.init();
        scheduleServer.initializeContext();
        scheduleServer.initializeListeners();
        scheduleServer.createSystemObjects();
        System.out.println("Start working......");
    }
}
