package programs;

public class program17 {

	public static void main(String[] args) {
		 program17 saver1 = new program17();
		 program17 saver2 = new program17();
		 saver1.setprogram17(2000.00);
		 saver2.setprogram17(3000.00);
		 program17.modifyInterestRate(0.04);
		 saver1.calculateMonthlyInterest();
		 saver2.calculateMonthlyInterest();
		 System.out.printf("New Balance for Saver1=%f\n",saver1.getSavingsBalance());
		 System.out.printf("New Balance for Saver2=%f\n",saver2.getSavingsBalance());
		 program17.modifyInterestRate(0.05);
		 saver1.calculateMonthlyInterest();
		 saver2.calculateMonthlyInterest();
		 System.out.printf("New Balance for Saver1=%f\n",saver1.getSavingsBalance());
		 System.out.printf("New Balance for Saver2=%f\n",saver2.getSavingsBalance());
		 
		 }

	private Object getSavingsBalance() {
		// TODO Auto-generated method stub
		return null;
	}

	private void calculateMonthlyInterest() {
		// TODO Auto-generated method stub
		
	}

	private static void modifyInterestRate(double d) {
		// TODO Auto-generated method stub
		
	}

	private void setprogram17(double d) {
		// TODO Auto-generated method stub
		
	}
}
