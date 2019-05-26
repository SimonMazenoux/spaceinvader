package fr.unilim.iut.spaceinvaders.model;

public class Envahisseur extends Sprite{

	private Direction direction;
	
	
	public Envahisseur(Dimension dimension, Position positionOrigine, int vitesse, Direction directionInitiale) {
		super(dimension, positionOrigine, vitesse);
		this.direction = directionInitiale;
	}


	public void changerDirection(Direction direction) {
		this.direction = direction;
	}


	public boolean seDirigeVersLaGauche() {
		if (direction == Direction.GAUCHE) {
			return true;
		}
		return false;
	}
	
	public boolean seDirigeVersLaDroite() {
		if (direction == Direction.DROITE) {
			return true;
		}
		return false;
		
	}
	
	
}