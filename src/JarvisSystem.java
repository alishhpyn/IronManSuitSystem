public class JarvisSystem implements SuitSystem{

    @Override
    public void initialize() {
        System.out.println("JARVIS: Suit system initialized.");
    }

    @Override
    public void executeCommand(String command) {
        System.out.println("JARVIS executes:"+ command);
    }
}
