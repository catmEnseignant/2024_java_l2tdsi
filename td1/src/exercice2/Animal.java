package exercice2;

public class Animal {
	public String cri() {
		
		return "";

}
 @Override
public String toString() {
    return "Je suis un animal";
}
}

class Chat extends Animal {
public String cri() {
    return "Miaaaw !";
}

@Override
public String toString() {
    return "Je suis un chat !";
}
}

class Chien extends Animal {
@Override
public String toString() {
    return "Je suis un chien !";
}

public String aboyer() {
    return "Haw haw !";
}
}


