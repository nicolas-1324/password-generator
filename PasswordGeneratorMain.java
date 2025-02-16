import java.lang.StringBuilder;
import java.util.*;
import java.io.File;
import java.io.FileWriter;


public class PasswordGeneratorMain{
	public static void main(String[] args){
		StringBuilder niz = new StringBuilder();
		Scanner in  = new Scanner(System.in);

		/*TODO:
		- Dodaj vec znakov, ki jih genrator lahko generira;
		- Dodaj moznost, da uporabnik shrani geslo v .txt datoteko na poljubno mesto na racunalniku;
		*/
		for(int i = 0; i<15; i++){
			int randSt = (int)(Math.random() * (90-65+1)+65);
			char randZnak = (char) randSt;
			niz = niz.append(randZnak);
		}
		System.out.println("Your generated password is: " + niz);
		System.out.print("Do you want to save your password to a .txt file? [y/n]: ");

		String vnosUporabnikaYN = in.next();
		char vnosUporabnikaYNChar = vnosUporabnikaYN.charAt(0);

		if(vnosUporabnikaYNChar == 'y'){
			//krejiranje datoteke z generiranim geslom
			System.out.print("Path: ");
			String potDoMape = in.next();

			try{
				File pot = new File(potDoMape);
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
	}
}
