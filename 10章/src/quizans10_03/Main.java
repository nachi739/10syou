package quizans10_03;

import code10_01.Hero;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero();
		PoisonMatango pm = new PoisonMatango('A');

		for (int i = 0; i < 6; i++) {
			pm.attack(h);
			System.out.println("勇者のHP=" + h.hp);
		}
	}

}
