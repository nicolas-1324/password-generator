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
		- Dodaj moznost, da uporabnik shrani geslo v .txt datoteko; DONE!
		*/
		for(int i = 0; i<15; i++){
			int randSt = (int)(Math.random() * (90-65+1)+65);
			char randZnak = (char) randSt;
			niz = niz.append(randZnak);
		}
		String nizniz = niz.toString();
		System.out.println("Your generated password is: " + niz);
		System.out.print("Do you want to save your password to a .txt file? [y/n]: ");

		String vnosUporabnikaYN = in.next();
		char vnosUporabnikaYNChar = vnosUporabnikaYN.charAt(0);

		if(vnosUporabnikaYNChar == 'y'){
			//krejiranje datoteke z generiranim geslom
			String potDoMape = "/home/niki/Desktop/password.txt";
			try{
				File pot = new File(potDoMape);
				pot.createNewFile();

				FileWriter pisalec = new FileWriter(potDoMape);
				pisalec.write(nizniz);
				pisalec.close();

				System.out.println("Succes, path to txt file: " + potDoMape);
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
	}
}
