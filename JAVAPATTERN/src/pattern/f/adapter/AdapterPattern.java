package pattern.f.adapter;

/**
 * @author ZLP
 *http://www.runoob.com/design-pattern/adapter-pattern.html
 *������ģʽ��Adapter Pattern������Ϊ���������ݵĽӿ�֮�������
 */
public class AdapterPattern {

		public static void main(String[] args) {
			
			AudioPlayer ap = new AudioPlayer();
			ap.play("MP3", "sayonara no yimi");
			ap.play("MP4", "synchronicity");
			ap.play("VLC", "influencer");
			ap.play("MKV", "nogizaka");
		}
}
