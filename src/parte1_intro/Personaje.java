package parte1_intro;

import java.util.Arrays;
import java.util.Objects;

public class Personaje {

	private String name;
	private int life;
	private int score;
	private int puntosFuerza;
	private String[] mochila = new String[10];

	public Personaje() {
		super();
	}

	public Personaje(String name, int puntosFuerza, String[] mochila) {
		super();
		this.name = name;
		this.life = 100;
		this.score = 0;
		this.puntosFuerza = puntosFuerza;
		this.mochila = mochila;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String[] getMochila() {
		return mochila;
	}

	public void setMochila(String[] mochila) {
		this.mochila = mochila;
	}	

	public int getPuntosFuerza() {
		return puntosFuerza;
	}

	public void setPuntosFuerza(int puntosFuerza) {
		this.puntosFuerza = puntosFuerza;
	}

	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(mochila);
		result = prime * result + Objects.hash(life, name, puntosFuerza, score);
		return result;
	}

	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personaje other = (Personaje) obj;
		return life == other.life && Arrays.equals(mochila, other.mochila) && Objects.equals(name, other.name)
				&& puntosFuerza == other.puntosFuerza && score == other.score;
	}

	
	public String toString() {
		return "Personaje [name=" + name + ", life=" + life + ", score=" + score + ", puntosFuerza=" + puntosFuerza
				+ ", mochila=" + Arrays.toString(mochila) + "]";
	}

	public void agregar(String agregado) {
		for (String m : mochila) {
			if (m.isEmpty()) {
				m = agregado;
				System.out.println("Tiene " + m.length() + " objetos en el inventario");

			} else {
				System.out.println("No tiene espacio en la mochila");
			}
		}

	}
	
	public void puntosDeVida(int golpe) {
		life -= golpe;
		if(life>=0) {
			System.out.println("Tiene " +life +" puntos de vida");
		}else {
			life = 0;
			System.out.println("Tiene " +life +" puntos de vida");
		}
	}
	
	public void regenerarVida() {
		for (String m : mochila) {
			if(m.equalsIgnoreCase("poción")) {
				life+=10;
				System.out.println("botiquín aplicado +10");
				System.out.println("Tiene " +life +" puntos de vida");
			}else {
				System.out.println("No tiene poción");
			}
		}
	}
}
