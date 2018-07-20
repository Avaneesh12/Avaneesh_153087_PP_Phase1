package payment.repo;

import java.util.HashMap;
import java.util.Map;

import payment.beans.Customer;

public class WalletRepoImpl implements WalletRepo {

	private HashMap<String, Customer> customerData;

	public WalletRepoImpl(Map<String, Customer> customerData) {
		this.customerData = (HashMap<String, Customer>) customerData;
	}

	@Override
	public Customer findOne(String mobileNo) {
		if (customerData.containsKey(mobileNo)) {
			return customerData.get(mobileNo);

		}
		return null;

	}

	@Override
	public boolean save(Customer customer) {
		if (customerData.containsKey(customer.getMobileNo())) {
			return false;
			
		}
		

		customerData.put(customer.getMobileNo(), customer);
		return true;
	}

}