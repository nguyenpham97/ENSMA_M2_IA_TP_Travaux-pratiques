package fr.ensma.a3.ia.AgentCase;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class CaseModele {
	
	private CasePresentation pres;
	private ImageView imgV;
	
	public CaseModele(CasePresentation p) {
		this.pres = p;
		imgV = new ImageView(new Image("vide.png"));
		imgV.setFitHeight(70);
		imgV.setFitWidth(70);
	}
	
	public void setImageView(String url) {
		this.imgV = new ImageView(new Image(url));
		imgV.setFitHeight(70);
		imgV.setFitWidth(70);
	}
	
	public ImageView getCaseImageView() {
		return imgV;
	}
	
}
