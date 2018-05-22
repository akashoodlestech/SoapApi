package OrderStatus;

import com.google.gson.Gson;

import utility.ErrorCode;
import utility.UrlMapping;
import utility.Utility;

public class PartOrderStatus {
	
		Utility utility=new Utility();
	
	public OrderStatusResponse orderStatus(OrderStatusRequest orderStatusRequest){
		try{
			System.out.println(Utility.getfullDate()+"|OrderStatus Order Received |"+orderStatusRequest.getOrderNumber());
			Gson gson=new Gson();
			OrderStatus orderstatus=new OrderStatus();
			orderstatus.setOrderStatusRequest(orderStatusRequest);
			
			String orderstatusrequest=gson.toJson(orderstatus);
			String result=utility.callUrl(UrlMapping.ORDER_STATUS, orderstatusrequest, "POST");
			if(result!=null){
				
				OrderStatusResponseBean orderstatus1=gson.fromJson(result,OrderStatusResponseBean.class );
				System.out.println(Utility.getfullDate()+"|Response Return |"+result+" |Order Number|"+orderStatusRequest.getOrderNumber());
				if(orderstatus1.getOrderStatusResponse()!=null){
					return orderstatus1.getOrderStatusResponse();}else{
						return orderStatusResponse(orderStatusRequest,"400","Error");
	
					}
			}else{
				//null value return
				System.out.println(Utility.getfullDate()+"|OrderStatus Order Response |"+orderStatusRequest.getOrderNumber());
				return orderStatusResponse(orderStatusRequest,ErrorCode.RESULT_NULL,"Result NUll");
			}
	}catch(Exception ex){
			ex.printStackTrace();
			System.out.println(Utility.getfullDate()+"|OrderStatus Order Response |"+orderStatusRequest.getOrderNumber());
			return orderStatusResponse(orderStatusRequest,ErrorCode.EXCEPTION_OCCUR,"Error");
		}
	}
	private OrderStatusResponse orderStatusResponse(OrderStatusRequest orderstatusrequest,String errorcode,String errormsg){
		OrderStatusResponse orderStatusResponse=new OrderStatusResponse();
		OpenItems openItems=new OpenItems();
		PartList partList=new PartList();
		PartData [] partData =new PartData[1];
		partData[0]=new PartData();
		partData[0].setInvoiceNumber(orderstatusrequest.getOrderNumber());
		partData[0].setStatus(errormsg);
		partList.setPartData(partData);
		openItems.setPartList(partList);
		orderStatusResponse.setOpenItems(openItems);
		return orderStatusResponse ;
	}
}
