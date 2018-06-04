package pattern.f.adapter;

/**
 * @author ZLP
 *http://www.runoob.com/design-pattern/adapter-pattern.html
 *适配器模式（Adapter Pattern）是作为两个不兼容的接口之间的桥梁
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
