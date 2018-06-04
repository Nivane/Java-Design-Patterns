package pattern.f.adapter;

public class Mp4Player implements AdvancedMediaPlayer{

	@Override
	public void play(String name) {
		// TODO Auto-generated method stub
		System.out.println("Play MP4: " + name);
	}

}
