package request.Credit;

import request.Request;
import request.Model.Credentials;
import request.Model.Application;
import request.Model.Reports;
import request.Model.Transaction;
import request.Model.PayPal;
import request.Model.EnhancedData;

public class AuthorizationCompletion extends Request<AuthorizationCompletion>  {
	private Credentials credentials = null;
	private Application application = null;
	private Reports reports = null;
	private Transaction transaction = null;
	private PayPal payPal = null;
	private EnhancedData enhancedData = null;

    public AuthorizationCompletion() {
        super("payment", "credit", "authorizationCompletion", "POST");
        
    }

	public Credentials getCredentials() {
		return credentials;
	}
	public void setCredentials(Credentials credentials) {
		this.credentials = credentials;
	}
	public Application getApplication() {
		return application;
	}
	public void setApplication(Application application) {
		this.application = application;
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
	public PayPal getPayPal() {
		return payPal;
	}
	public void setPayPal(PayPal payPal) {
		this.payPal = payPal;
	}
	public EnhancedData getEnhancedData() {
		return enhancedData;
	}
	public void setEnhancedData(EnhancedData enhancedData) {
		this.enhancedData = enhancedData;
	}
}