package com.coderising.atm;

public class CardReader {
	//ATM atm;

	public CardReader() {
		//this.atm = atm;
	}

	public static final int CARDNUM = 12345678;

	public int getAccount() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (!detectCard()) {
			//System.out.println("?????��??");
			throw new RuntimeException("?????��??");
		}

		int cardnum = readCardNum();
		return cardnum;
		
	}

	private int readCardNum() {
		// TODO Auto-generated method stub
		return CARDNUM;
	}

	// ????????????????????????????��?
	private boolean detectCard() {
		return true;
	}


	public void ejectCard() {
		// TODO Auto-generated method stub
		
	}
}
	
