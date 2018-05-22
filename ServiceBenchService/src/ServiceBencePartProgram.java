import com.google.gson.Gson;

import OrderStatus.OrderStatusRequest;
import OrderStatus.OrderStatusResponse;
import OrderStatus.PartOrderStatus;
import cancel.CancelOrder;
import cancel.CancelRequest;
import cancel.CancelResponse;
import create.CreateOrder;
import create.PlaceOrder;
import create.PlaceOrderResponse;
import invoice.Invoice;
import invoice.InvoiceRequest;
import invoice.InvoiceResponse;
import returnpart.ReturnPart;
import returnpart.ReturnRequest;
import returnpart.ReturnResponse;
import returnpart.ReturnResponseData;
import search.PartResponse;
import search.PartSearch;
import search.PartSearchRequest;
import search.PartSearchResponse;
import utility.ConfigLoad;

public class ServiceBencePartProgram {
	static{
		ConfigLoad configload=new ConfigLoad();
		configload.loadProperties();
	}
	public CancelResponse cancelOrder(CancelOrder cancelOrder){
		CancelResponse response=null;
		CancelRequest cr=new CancelRequest();
		return cr.cancelOrder(cancelOrder);
	}
	
	
	/*create order*/
	public PlaceOrderResponse createOrder(PlaceOrder placeOrder){
		CreateOrder createOrder=new CreateOrder();
		return createOrder.createOrder(placeOrder);
	}
	
	public InvoiceResponse invoiceDetails(InvoiceRequest invoiceRequest){
		Invoice invoice =new Invoice();
		return invoice.invoiceDetails(invoiceRequest);
		
	}

	public OrderStatusResponse orderStatus(OrderStatusRequest orderStatusRequest){
		//System.out.println("OrderStatus Order Received |"+orderStatusRequest);
		PartOrderStatus partOrderStatus=new PartOrderStatus();
		return partOrderStatus.orderStatus(orderStatusRequest);
	}
	
	public ReturnResponseData  returnPart(ReturnRequest returnRequest){
		//String invoicenumber =returnRequest.getInvoiceNumber();
		//String trackingNumber=returnRequest.getReturnTrackingNumber();
		ReturnPart returnPart=new ReturnPart();
		return returnPart.returnPart(returnRequest);	
	}
	
	public PartSearchResponse partSearch(PartSearchRequest partSearchRequest){
		//System.out.println("Request Received |"+partSearchRequest);
		PartSearch partSearch=new PartSearch();
		PartSearchResponse partResponse=partSearch.partSearch(partSearchRequest);
		Gson gson=new Gson();
		String result=gson.toJson(partResponse);
		System.out.println("Result return|"+result);
		return partResponse;
	}
	
}