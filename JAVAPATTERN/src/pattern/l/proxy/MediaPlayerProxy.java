package pattern.l.proxy;

public class MediaPlayerProxy implements IMediaPlayer{
	
	private MediaPlayer mp;
	
	public MediaPlayerProxy() {
		mp = new MediaPlayer();
	}
	
	
	public MediaPlayer getMp() {
		return mp;
	}


	public void setMp(MediaPlayer mp) {
		this.mp = mp;
	}

	@Override
	public void play(String name) {
		// TODO Auto-generated method stub
		mp.play(name);
	}

		
}
