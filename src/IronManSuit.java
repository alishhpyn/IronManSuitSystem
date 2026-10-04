public abstract class IronManSuit {
    protected SuitSystem system;

    public IronManSuit(SuitSystem system){
    this.system = system;
    }

    public void setSystem(SuitSystem system){
        this.system = system;
        System.out.println("Control system changed.");
    }

    public void activate(){
        system.initialize();
    }

    public void deactivate(){
        system.executeCommand("Deactivate suit");
    }
}
