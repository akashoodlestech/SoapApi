package utility;

public class UrlMapping {
	public static String CREATE_ORDER="http://localhost:8080/skulocity/api/v1/thirdparty/createorder"; //POST REQUEST
	public static String CANCEL_ORDER="http://localhost:8080/skulocity/api/v1/thirdparty/cancelorder/"; //POST URL
	public static String ORDER_STATUS="http://localhost:8080/skulocity/api/v1/thirdparty/getOrderStatus"; //POST REQUEST
	public static String INVOICE_STATUS="http://localhost:8080/skulocity/api/v1/thirdparty/invoicestatus"; //POST REQUEST
	public static String RETURN= "http://localhost:8080/skulocity/api/v1/thirdparty/return"; //POST REQUEST
	public static String CREATE_RETURN="http://localhost:8080/skulocity/api/v1/thirdparty/createreturn"; //POST REQUEST
	public static String SEARCH_PRODUCT="http://localhost:8080/skulocity/api/v1/thirdparty/searchProduct";
}