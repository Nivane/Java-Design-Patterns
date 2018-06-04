package pattern.f.adapter;

public class AudioPlayer implements MediaPlayer{

	
	private MediaAdapter ma;
	
	@Override
	public void play(String type, String name) {
		// TODO Auto-generated method stub
		if(type.equalsIgnoreCase("MP3")) {
			System.out.println("Play MP3: " + name);
		}else if(type.equalsIgnoreCase("MP4") || type.equalsIgnoreCase("VLC")) {
			ma = new MediaAdapter(type);
			ma.play(type, name);
		}else {
			System.out.println("≤ªºÊ»›∏Ò Ω");
		}
		
	}
	
}
