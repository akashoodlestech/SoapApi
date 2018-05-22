package cancel;

import com.google.gson.Gson;

import utility.ErrorCode;
import utility.UrlMapping;
import utility.Utility;

public class CancelRequest {
	Utility utility=new Utility();
	public CancelResponse cancelOrder(CancelOrder cancelOrder){
		Gson gson=new Gson();
		String cancelOrdertoJson=gson.toJson(cancelOrder);
		System.out.println(Utility.getfullDate()+"|Cancel Order Json |"+cancelOrdertoJson);
		String orderNUmber=cancelOrder.getOrderNumber();
		String confirmationNumber=cancelOrder.getOrderConfirmationNumber();
		try{
			System.out.println(Utility.getfullDate()+"|orderNUmber |"+orderNUmber+" | confirmationNumber|"+confirmationNumber);
			String result=utility.callUrl(UrlMapping.CANCEL_ORDER+orderNUmber, cancelOrdertoJson, "PUT");
			System.out.println(Utility.getfullDate()+"Output |"+result);
			if(result!=null){
				SkulocityCancelOrderResponse cancelresponse=gson.fromJson(result, SkulocityCancelOrderResponse.class);
				 return cancelOrderResponse("100",cancelresponse.getMessage());
			}else{
				System.out.println(Utility.getfullDate()+"|orderNUmber |"+orderNUmber+" | confirmationNumber|"+confirmationNumber+"Result Null ");
				return cancelOrderResponse(ErrorCode.RESULT_NULL,"System Error .Please check");
			}
		} catch(Exception ex){
			ex.printStackTrace();
			System.out.println(Utility.getfullDate()+"|orderNUmber |"+orderNUmber+" | confirmationNumber|"+confirmationNumber+"Exception Occur ");
			return cancelOrderResponse(ErrorCode.EXCEPTION_OCCUR,"System Error .Please check");
		}
	}
	
	private CancelResponse cancelOrderResponse(String errorcode,String errorMsg){
		CancelResponse cancelResponse=new CancelResponse();
		cancelResponse.setErrorCode(errorcode);
		cancelResponse.setErrorMessage(errorMsg);
		return cancelResponse;
	}
	private CancelResponse cancelOrderErrorResponse(String orderNUmber,String confirmationNumber){
		CancelResponse cancelResponse=new CancelResponse();
		cancelResponse.setErrorCode("101");
		cancelResponse.setErrorMessage("Error Please check");
		return cancelResponse;
	}

}
