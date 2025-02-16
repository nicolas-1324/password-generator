import java.lang.StringBuilder;

public class PasswordGeneratorMain{
	public static void main(String[] args){
		StringBuilder niz = new StringBuilder();
		//Zgeneriraj random stevilko med 33 in 126 vkljucno
		for(int i = 0; i<15; i++){
			int randSt = (int)(Math.random() * 126-33+1)+33;
			char randZnak = (char) randSt;
			niz = niz.append(randZnak);
		}
		System.out.println("Your generated password is: " + niz);
	}
}
