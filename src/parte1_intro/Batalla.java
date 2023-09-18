package parte1_intro;

public class Batalla {

	public static Personaje pelea (Personaje p1, Personaje p2) {
		do {
			int golpe;
			golpe = (int) (Math.random()*3) +1;			
			p1.puntosDeVida(golpe);
			if(p1.getLife()<30);
			p1.regenerarVida();
			int golpe2;
			golpe2 = (int) (Math.random()*3) +1;
			p2.puntosDeVida(golpe2);
			if(p2.getLife()<30);
			p2.regenerarVida();			
		}while(p1.getLife()>0 || p2.getLife()>0);
		
		if(p1.getLife()>p2.getLife()) {
			return p1;
		}else {
			return p2;
		}
	}
}
