package search;

import com.google.gson.Gson;

import utility.ErrorCode;
import utility.UrlMapping;
import utility.Utility;

public class PartSearch {
	Utility utility=new Utility();
	public PartSearchResponse partSearch(PartSearchRequest partSearchRequest){
		try{
		System.out.println(Utility.getfullDate()+"|Request Received |"+partSearchRequest);
		Gson gson=new Gson();
		String partSearchRequestdata=gson.toJson(partSearchRequest);
		String result=utility.callUrl(UrlMapping.SEARCH_PRODUCT, partSearchRequestdata, "POST");
		if(result!=null){
			System.out.println(Utility.getfullDate()+"|PartSearch Result |"+result);
			PartSearchResponse partSearchResponse=gson.fromJson(result,PartSearchResponse.class );
			if(partSearchResponse!=null && partSearchResponse.getMessage()!=null){
			return partSearchResponse ;}else{
				partSearchResponse=new PartSearchResponse();
				partSearchResponse.setError("PartNotFound");
				partSearchResponse.setMessage("Error");
				partSearchResponse.setStatus("101");
				return partSearchResponse;
				
				
			}
		}else{
			System.out.println(Utility.getfullDate()+"|partSearch |Result Null| ");
			return partSearchResponse(ErrorCode.RESULT_NULL,"System Error ");
		}
		}catch(Exception ex){
			System.out.println(Utility.getfullDate()+"|Exception Occur.please check|"+partSearchRequest.getPartNumber());
			return partSearchResponse(ErrorCode.EXCEPTION_OCCUR,"System Error ");
		}
	}
	
	private PartSearchResponse partSearchResponse(String errorcode,String message){
		PartSearchResponse  partSearchResponse=new PartSearchResponse();
		partSearchResponse.setError(errorcode);
		partSearchResponse.setMessage(message);
		//partSearchResponse.setPartList("1");
		//PartData partData=new PartData();
		//partSearchResponse.setData(partData);
		return partSearchResponse;
		
	}
}
