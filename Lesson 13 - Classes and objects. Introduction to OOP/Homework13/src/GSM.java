public class GSM {
	String model;
	boolean hasSimCard;
	String simMobileNumber;
	int outgoingCallsDuration;
	String lastIncomingCall;
	String lastOutgoingCall;
	double lastIncomingCallDuration;
	double lastOutgoingCallDuration;

	 public void insertSimCard(String simMobileNumber) {
		if (simMobileNumber.matches("(08)[0-9]{8}")) {
			this.simMobileNumber = simMobileNumber;
			this.hasSimCard = true;
		} else {
			System.out.println("Invalid Mobile Number");
		}
	}

	void removeSimCard() {
		hasSimCard = false;
	}
	 public void call(GSM receiver, double duration) {
		if (duration < 0 || this.simMobileNumber == receiver.simMobileNumber
				|| this.hasSimCard || receiver.hasSimCard) {
			System.out.println("Invalid Call");
		}
		receiver.lastIncomingCall = this.simMobileNumber;
		this.lastOutgoingCall = receiver.simMobileNumber;
		this.outgoingCallsDuration += duration;
		receiver.lastIncomingCallDuration = duration;
		this.lastOutgoingCallDuration = duration;
	}

	 public void getSumForCall() {
		System.out.println("Price to pay  " + (double)Math.round(this.outgoingCallsDuration
				* Call.priceForAMinute*100)/100+" lv.");
	}

	void printInfoForTheLastOutgoingCall() {
		if (this.lastOutgoingCall != null) {
			System.out.println("Last outgoing call " + this.lastOutgoingCall);
			System.out.println("Last outgoing call duration " + (double)Math.round(this.lastOutgoingCallDuration*100)/100);
		}else {
			System.out.println("You have no outgoing calls");
		}
	}

	public void printInfoForTheLastIncomingCall() {
		if (this.lastIncomingCall != null) {
			System.out.println("Last incoming call " + this.lastIncomingCall);
			System.out.println("Last incoming call duration " + (double)Math.round(this.lastIncomingCallDuration*100)/100);
		}else {
			System.out.println("You have no incoming calls");
		}
	}
}
