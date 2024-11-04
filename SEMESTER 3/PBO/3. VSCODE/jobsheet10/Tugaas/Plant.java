public class Plant {
    public void doDestroy(Destroyable d) {
        d.destroyed(); // Call the destroyed method on the Destroyable object
        if (d instanceof WalkingZombie) {
            WalkingZombie wz = (WalkingZombie) d;
            System.out.println("WalkingZombie health reduced to: " + wz.getHealth());
        } else if (d instanceof JumpingZombie) {
            JumpingZombie jz = (JumpingZombie) d;
            System.out.println("JumpingZombie health reduced to: " + jz.getHealth());
        } else if (d instanceof Barrier) {
            Barrier b = (Barrier) d;
            System.out.println("Barrier strength reduced to: " + b.getStrength());
        }
    }
}