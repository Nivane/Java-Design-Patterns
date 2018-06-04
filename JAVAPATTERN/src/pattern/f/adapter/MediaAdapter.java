package pattern.f.adapter;

public class MediaAdapter implements MediaPlayer{

	
	private AdvancedMediaPlayer adp;
	
	public MediaAdapter(String type) {
		// TODO Auto-generated constructor stub
		if(type.equalsIgnoreCase("MP4")) {
			adp = new Mp4Player();
		}else {
			adp = new VLCPlayer();
		}
	}
	
	@Override
	public void play(String type, String name) {
		// TODO Auto-generated method stub
		adp.play(name);
	}
	
}
