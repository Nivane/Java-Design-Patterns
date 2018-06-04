package pattern.f.adapter;

public class VLCPlayer implements AdvancedMediaPlayer{

	@Override
	public void play(String name) {
		// TODO Auto-generated method stub
		System.out.println("Play VLC: " + name);
	}

}
