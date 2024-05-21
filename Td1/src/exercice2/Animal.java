package exercice2;

public class Animal {
	public String cri() {
		return "";
	}

	@Override
	public String toString() {

		return "Je suis un animal";
	}

	public class Chat extends Animal {

		@Override
		public String cri() {

			return "Miaaaw !";
		}

		@Override
		public String toString() {

			return "Je suis un chat !";
		}
	}

	public class Chien extends Animal {
		@Override
		public String toString() {

			return "Je suis un chien !";
		}

		public String aboyer() {

			return "Haw haw !";
		}
	}

}
