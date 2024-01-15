public class ServerManager {
    private ServerSwitch startServer;
    private ServerSwitch stopServer;

    public ServerManager() {
        ScheduleServer scheduleServer = new ScheduleServer();
        this.startServer = new StartServer(scheduleServer);
        this.stopServer = new StopServer(scheduleServer);
    }

    public void startServer() {
        this.startServer.toggleServer();
    }

    public void stopServer() {
        this.stopServer.toggleServer();
    }
}
