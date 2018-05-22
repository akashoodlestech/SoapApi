package search;
public class PartSearchResponseData
{
	private String timestamp;

    private String message;

    private String extendedMessage;

    private String error;

    private String status;

    private PartList data;

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getExtendedMessage() {
		return extendedMessage;
	}

	public void setExtendedMessage(String extendedMessage) {
		this.extendedMessage = extendedMessage;
	}

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

	public PartList getData() {
		return data;
	}

	public void setData(PartList data) {
		this.data = data;
	}
    
    


    /*public String getErrorMessage ()
    {
        return errorMessage;
    }

    public void setErrorMessage (String errorMessage)
    {
        this.errorMessage = errorMessage;
    }

    public String getErrorCode ()
    {
        return errorCode;
    }

    public void setErrorCode (String errorCode)
    {
        this.errorCode = errorCode;
    }

    public PartData getPartData ()
    {
        return partData;
    }

    public void setPartData (PartData partData)
    {
        this.partData = partData;
    }

    public String getPartList ()
    {
        return partList;
    }

    public void setPartList (String partList)
    {
        this.partList = partList;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [errorMessage = "+errorMessage+", errorCode = "+errorCode+", partData = "+partData+", partList = "+partList+"]";
    }*/
}