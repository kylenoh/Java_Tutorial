package rspGameWithReferee;
import java.util.Random;

public class Enemy {
	Random scanner = new Random();
	
	public int fire() {
		return scanner.nextInt(3) + 1;
	}
}
