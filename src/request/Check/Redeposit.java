package request.Check;

import request.Request;
import request.Model.Application;
import request.Model.Credentials;
import request.Model.DemandDepositAccount;
import request.Model.PaymentAccount;
import request.Model.Reports;
import request.Model.Transaction;

public class Redeposit extends Request<Redeposit>  {
	private Application application = null;
	private Credentials credentials = null;
	private DemandDepositAccount demandDepositAccount = null;
	private PaymentAccount paymentAccount = null;
	private Reports reports = null;
	private Transaction transaction = null;

    public Redeposit() {
        super("payment", "check", "redeposit", "POST");
        
    }

	public Application getApplication() {
		return application;
	}
	public void setApplication(Application application) {
		this.application = application;
	}
	public Credentials getCredentials() {
		return credentials;
	}
	public void setCredentials(Credentials credentials) {
		this.credentials = credentials;
	}
	public DemandDepositAccount getDemandDepositAccount() {
		return demandDepositAccount;
	}
	public void setDemandDepositAccount(DemandDepositAccount demandDepositAccount) {
		this.demandDepositAccount = demandDepositAccount;
	}
	public PaymentAccount getPaymentAccount() {
		return paymentAccount;
	}
	public void setPaymentAccount(PaymentAccount paymentAccount) {
		this.paymentAccount = paymentAccount;
	}
	public Reports getReports() {
		return reports;
	}
	public void setReports(Reports reports) {
		this.reports = reports;
	}
	public Transaction getTransaction() {
		return transaction;
	}
	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
}