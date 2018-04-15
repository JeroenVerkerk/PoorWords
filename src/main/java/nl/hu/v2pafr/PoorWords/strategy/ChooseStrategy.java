package nl.hu.v2pafr.PoorWords.strategy;

public class ChooseStrategy {
	PictureContext context = new PictureContext();
	private String picture;
	
	//Kies aan de hand van een aantal worden in een zin de juiste strategy om de juiste foto te krijgen
	public String chooseStrategy(String zin) {
		if (zin.contains("brood") && zin.contains("eet")) {
			context.setPictureStrategy(new ManBroodStrategy());
			picture = context.showPicture();
		}
		else if (zin.contains("man") && zin.contains("boer") && zin.contains("eet")) {
			context.setPictureStrategy(new ManBoerStrategy());
			picture = context.showPicture();
		}
		else if (zin.contains("brood") && zin.contains("snijdt")) {
			context.setPictureStrategy(new BroodSnijdenStrategy());
			picture = context.showPicture();
		}
		else if (zin.contains("boer") && zin.contains("laat")) {
			context.setPictureStrategy(new BoerLatenStrategy());
			picture = context.showPicture();
		}
		else if (zin.contains("brood") && zin.contains("koopt")) {
			context.setPictureStrategy(new BroodKopenStrategy());
			picture = context.showPicture();
		}
		else {
			context.setPictureStrategy(new GeenFotoStrategy());
			picture = context.showPicture();
		}
		return picture;
	}
}
