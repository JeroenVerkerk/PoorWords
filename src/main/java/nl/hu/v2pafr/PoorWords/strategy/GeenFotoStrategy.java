package nl.hu.v2pafr.PoorWords.strategy;

public class GeenFotoStrategy implements PictureStrategy{
	private String src;

	//Return het pad naar de foto
	public String showPicture() {
		src = "geen_foto.jpg";
		return src;
	}
}
