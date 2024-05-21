package exercice2;

public class TestAnimaux {

	public static void main(String[] args) {

		Animal animal = new Animal();
		Chat chat = new Chat();
		Chien chien = new Chien();

		System.out.println(animal);
		System.out.println(chat);
		System.out.println(chien);

		System.out.println(animal.cri());
		System.out.println(chat.cri());
		System.out.println(chien.cri());
		System.out.println(chien.aboyer());

		Animal achat = chat;
		Animal achien = chien;

		System.out.println(achat);
		System.out.println(achien);

	}

}
