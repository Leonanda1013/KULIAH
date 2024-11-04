public class JumpingZombie extends Zombie {
    public JumpingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void heal() {
        switch (level) {
            case 1:
                health += ((30 / 100) * health);
                break;
            case 2:
                health += ((40 / 100) * health);
                break;
            case 3:
                health += ((50 / 100) * health);
                break;

        }
    }

    @Override
    public void destroyed() {
        health -= (0.02 * health); // Kurangi health 2% setiap kali dipanggil
        if (health < 0) {
            health = 0; // Menjaga agar health tidak negatif
        }
    }

    @Override
    public String getZombieInfo() {
        return "Jumping Zombieie Data = \n" +
                " Health = " + health + "\n" +
                " Level = " + level;
    }
}
