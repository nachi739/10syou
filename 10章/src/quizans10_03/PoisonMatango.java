package quizans10_03;

public class PoisonMatango extends Matango {
	int poisonCount = 5;
	public PoisonMatango(char suffix) {
		super(suffix);
	}
	public void attack(Hero h) {
		super.attack(h);
		if (this.poisonCount)
	}

}
