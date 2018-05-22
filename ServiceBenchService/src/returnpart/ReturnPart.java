package returnpart;

import com.google.gson.Gson;

import utility.ErrorCode;
import utility.UrlMapping;
import utility.Utility;

public class ReturnPart {

		private Utility utility=new Utility();
		private Gson gson=new Gson();
	
		public ReturnResponseData  returnPart(ReturnRequest returnRequest){
			try{
			System.out.println(Utility.getfullDate()+"|Request Received |"+returnRequest.getInvoiceNumber()+"| Data |"+returnRequest);
			String result=null;
			String invoicenumber =returnRequest.getInvoiceNumber();
			String trackingNumber=returnRequest.getReturnTrackingNumber();
			ReturnPartBean returnpartbean=new ReturnPartBean();
			returnpartbean.setReturnRequest(returnRequest);
			String returnpartdata=gson.toJson(returnpartbean);
			result=utility.callUrl(UrlMapping.CREATE_RETURN,returnpartdata,"POST");
			System.out.println(Utility.getfullDate()+"|invoicenumber |"+invoicenumber+" | trackingNumber|"+trackingNumber+" |result |"+result);
			if(result!=null){
				ReturnResponseData rs=gson.fromJson(result, ReturnResponseData.class);
				
				if(rs==null){
				 rs=new ReturnResponseData ();
				 rs.setMessage("ERROR");
				 rs.setStatus("BAD_REQUEST");
				}
				return rs;
			}else{
				//response null return
				return returnPartResponse(ErrorCode.RESULT_NULL,"System Error...please check");

			}
		}catch(Exception ex){
			ex.printStackTrace();
			return returnPartResponse(ErrorCode.EXCEPTION_OCCUR,"Exception Occur");
		}
	}
	
	private ReturnResponseData returnPartResponse(String errorcode,String error_reason){
		ReturnResponseData returnResponse=new ReturnResponseData();
		returnResponse.setMessage(error_reason);
		returnResponse.setError(errorcode);
		return returnResponse;
	}
	private ReturnResponse returnPartErrorResponse(String result){
		ReturnResponse returnResponse=null;
		returnResponse=gson.fromJson(result,ReturnResponse.class );
		return returnResponse;
	}
}
