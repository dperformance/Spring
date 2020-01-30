package polymorphism04;

public class AppleSpeaker implements Speaker {

	@Override
	public void volumnUp() {
		System.out.println(">> AppleSpeaker - 소리크게");
	}
	@Override
	public void volumnDown() {
		System.out.println(">> AppleSpeaker - 소리작게");
	}

}
