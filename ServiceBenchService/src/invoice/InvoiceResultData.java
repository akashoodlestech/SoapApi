package invoice;

public class InvoiceResultData {
	private String 	error;
	private String status;
	private InvoiceResponse invoiceResponse;
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public InvoiceResponse getInvoiceResponse() {
		return invoiceResponse;
	}
	public void setInvoiceResponse(InvoiceResponse invoiceResponse) {
		this.invoiceResponse = invoiceResponse;
	}
	

}
