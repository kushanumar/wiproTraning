package Day5.Assigment;

 abstract class Bank {
    abstract double getInterestRate();
}
 class SBI extends Bank {
	    @Override
	    public double getInterestRate() {
	        return 6.5;
	    }
	}
class PNB extends Bank {
	    @Override
	    public double getInterestRate() {
	        return 7.0;
	    }
	}
 public class Que2{	    
	    public static void main(String[] args) {
	        Bank sbi = new SBI();
	        Bank pnb = new PNB();
	        
	        System.out.println("SBI Interest Rate: " + sbi.getInterestRate() + "%");
	        System.out.println("PNB Interest Rate: " + pnb.getInterestRate() + "%");
	    }
	}
