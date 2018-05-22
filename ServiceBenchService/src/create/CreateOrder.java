package create;

import com.google.gson.Gson;

import utility.ErrorCode;
import utility.UrlMapping;
import utility.Utility;

public class CreateOrder {
	Utility utility=new Utility();
	public PlaceOrderResponse createOrder(PlaceOrder placeOrder){
		try{
			if(placeOrder!=null){
				Gson gson=new Gson();
				PlaceOrderRequest placeorderreq=new PlaceOrderRequest();
				placeorderreq.setPlaceOrder(placeOrder);
				String placeorderdata=gson.toJson(placeorderreq);
				System.out.println(Utility.getfullDate()+"|Create Order Request |"+placeorderdata);
				String result=utility.callUrl(UrlMapping.CREATE_ORDER,placeorderdata , "POST");
				System.out.println(Utility.getfullDate()+"|OutPut |"+result);
				if(result!=null){
					CreateOrderResponse placeorderresponse= 	gson.fromJson(result, CreateOrderResponse.class);
				return placeorderresponse.getPlaceOrderResponse();
				}else{
					return responseCreateOrder(ErrorCode.RESULT_NULL,"OrderNotCreated Due To System Error");
				}
			
			}else{
				//error
				return responseCreateOrder(ErrorCode.REQUEST_DATA_NULL,"OrderDataNULL");
				}
		}catch(Exception ex){
			return responseCreateOrder(ErrorCode.EXCEPTION_OCCUR,"OrderNotCreatedDueToException");		}
	}
	private PlaceOrderResponse responseCreateOrder(String errorCode,String errorMessage){
		PlaceOrderResponse placeOrderResponse =new PlaceOrderResponse();
		placeOrderResponse.setErrorCode(errorCode);
		placeOrderResponse.setErrorMessage(errorMessage);
		return placeOrderResponse;
	}

}
 