class Main{
    public static void main(String[] args){
        CombatSuit combatSuit = new CombatSuit(new JarvisSystem());
        System.out.println("=== COMBAT SUIT ===");

        combatSuit.activate();
        combatSuit.attack();
        combatSuit.defence();

        System.out.println("=== Switching System ===");

        combatSuit.setSystem(new FridaySystem());

        combatSuit.attack();
        combatSuit.defence();

        RescueSuit rescueSuit = new RescueSuit(new FridaySystem());

        System.out.println("=== RESCUE SUIT ===");

        rescueSuit.activate();
        rescueSuit.rescue();
        rescueSuit.scanArea();

        rescueSuit.deactivate();


    }

}