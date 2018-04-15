package nl.hu.v2pafr.PoorWords.strategy;

public class PictureContext {
	private PictureStrategy strategy;
	
	public void setPictureStrategy(PictureStrategy strategy) {
		this.strategy = strategy;
	}
	
	public String showPicture() {
		return strategy.showPicture();
	}
}
