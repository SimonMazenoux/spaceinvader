package fr.unilim.iut.spaceinvaders;

import fr.unilim.iut.spaceinvaders.utils.MissileException;

public class Vaisseau extends Sprite {

	public Vaisseau(Dimension dimension, Position positionOrigine, int vitesse) {
		super(dimension, positionOrigine, vitesse);
	}

	public Position calculerLaPositionDeTirDuMissile(Dimension dimensionMissile) {
		int abscisseMilieuVaisseau = this.abscisseLaPlusAGauche() + (this.longueur() / 2);
		int abscisseOrigineMissile = abscisseMilieuVaisseau - (dimensionMissile.longueur() / 2);

		int ordonneeeOrigineMissile = this.ordonneeLaPlusBasse() - 1;
		return new Position(abscisseOrigineMissile, ordonneeeOrigineMissile);
	}
	
	public Missile tirerUnMissile(Dimension dimensionMissile, int vitesseMissile) {
		if (dimensionMissile.longueur>this.longueur()) {
			throw new MissileException("Le missile ne peut pas etre plus large que le vaisseau");
		}
		Position positionOrigineMissile = calculerLaPositionDeTirDuMissile(dimensionMissile);
		return new Missile(dimensionMissile, positionOrigineMissile, vitesseMissile);
	}
	
}
