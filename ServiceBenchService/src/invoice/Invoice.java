package invoice;

import com.google.gson.Gson;

import utility.UrlMapping;
import utility.Utility;

public class Invoice {
	Utility utility=new Utility();
	public InvoiceResponse invoiceDetails(InvoiceRequest invoiceRequest){
		try{
			String invoiceNumber=invoiceRequest.getInvoiceNumber();
			System.out.println(Utility.getfullDate()+"|InvoiceDetails Request Received | invoice Number |"+invoiceNumber);
			Gson gson=new Gson();
			InvoiceRequestData invoicere=new InvoiceRequestData();
			invoicere.setInvoiceRequest(invoiceRequest);
			String invoiceRequestdata=gson.toJson(invoicere);
			String resultdata=utility.callUrl(UrlMapping.INVOICE_STATUS, invoiceRequestdata, "POST");
			if(resultdata!=null){
				System.out.println(Utility.getfullDate()+"|Result |Invoice Details |"+resultdata);
				 
				InvoiceResultData it1=gson.fromJson(resultdata, InvoiceResultData.class);
				if(it1!=null){
				InvoiceResponse it= it1.getInvoiceResponse();
				
				if(it!=null ){return it;}else{
					it=new InvoiceResponse();
					it.setInvoiceNumber(invoiceRequest.getInvoiceNumber());
					return it;
				}
			}else{
				//response is null
				System.out.println(Utility.getfullDate()+"|Response is null |"+invoiceNumber);
				return invoiceDetailsResponse(invoiceRequest);
			}}else{
				System.out.println(Utility.getfullDate()+"|Response is null |"+invoiceNumber);
				return invoiceDetailsResponse(invoiceRequest);
			}
			
		}catch(Exception ex){
			ex.printStackTrace();
			System.out.println(Utility.getfullDate()+"|Exception Occur |Please check..... |"+invoiceRequest.getInvoiceNumber());
			return invoiceDetailsResponse(invoiceRequest);
		}
		
	}
	private InvoiceResponse invoiceDetailsResponse(InvoiceRequest invoiceRequest){
		InvoiceResponse invoiceResponse=new InvoiceResponse();
		String invoiceNumber=invoiceRequest.getInvoiceNumber();
		invoiceResponse.setInvoiceNumber(invoiceNumber);
		return invoiceResponse;
	}

}
