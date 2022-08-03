package polymorphism;

public class SamsungTV implements TV {
	private SonySpeaker speaker;
	private int price;
	private int vo;

	public SamsungTV() {
		System.out.println("===> SamsungTV(1) ��ü ����");
	}

	public SamsungTV(SonySpeaker speaker) {
		System.out.println("===> SamsungTV(2) ��ü ����");
		this.speaker = speaker;
	}

	public SamsungTV(SonySpeaker speaker, int price,int vo) {
		System.out.println("===> SamsungTV(3) ��ü ����");
		this.speaker = speaker;
		this.price = price;
		this.vo = vo;
	}

	public void powerOn() {
		System.out.println("SamsungTV---���� �Ҵ�. (���� : " + price + ")");
	}

	public void powerOff() {
		System.out.println("SamsungTV---���� ����.");
	}
	public void a() {
		System.out.println(price+","+vo+","+speaker);
	}
	public void volumeUp() {
		speaker.volumeUp();
	}

	public void volumeDown() {
		speaker.volumeDown();
	}
}