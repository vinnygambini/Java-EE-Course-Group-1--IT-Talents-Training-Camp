
public class Call {
	static double priceForAMinute = 0.45;
	String caller;
	String receiver;
	double duration;

	public static void main(String[] args) {

		GSM valentin = new GSM();
		valentin.simMobileNumber = "0895507393";
		
		GSM evgeny = new GSM();
		evgeny.simMobileNumber = "0895507392";
		
		valentin.call(evgeny, 30);
		valentin.call(evgeny, 7.24);
		valentin.printInfoForTheLastOutgoingCall();
		valentin.printInfoForTheLastIncomingCall();
		valentin.getSumForCall();
	}
}
