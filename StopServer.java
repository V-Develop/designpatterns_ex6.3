public class StopServer implements ServerSwitch {

    private ScheduleServer scheduleServer;

    public StopServer(ScheduleServer scheduleServer) {
        this.scheduleServer = scheduleServer;
    }

    @Override
    public void toggleServer() {
        System.out.println("After work done.........");
        scheduleServer.releaseProcesses();
        scheduleServer.destory();
        scheduleServer.destroySystemObjects();
        scheduleServer.destoryListeners();
        scheduleServer.destoryContext();
        scheduleServer.shutdown();
    }
}
