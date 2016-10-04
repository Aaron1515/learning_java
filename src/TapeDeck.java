class TapeDeck {

	boolean canRecord = false;

	void playTape() {
		System.out.println("Tape playing");

	}

	void recordTape() {
		System.out.println("Tape recording");
	}
}

// Class to test TapeDeck
class TakeDeckTestDrive {
	public static void main(String[] args) {
		TapeDeck t = new TapeDeck();
		t.playTape();
	}
}