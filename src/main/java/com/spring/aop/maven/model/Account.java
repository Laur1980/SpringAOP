package com.spring.aop.maven.model;

public class Account {
	
	private String accountSerial;
		
	public Account(String accountSerial) {
		this.accountSerial = accountSerial;
	}

	public String getAccountSerial() {
		return accountSerial;
	}

	public void setAccountSerial(String accountSerial) {
		this.accountSerial = accountSerial;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountSerial == null) ? 0 : accountSerial.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (accountSerial == null) {
			if (other.accountSerial != null)
				return false;
		} else if (!accountSerial.equals(other.accountSerial))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Account [accountSerial=" + accountSerial + "]";
	}	
	
}
