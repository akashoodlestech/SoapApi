package returnpart;
public class ReturnResponseData
{
    private String timestamp;

    private String message;

    private String error;

    private String status;

    private ReturnResponse returnResponse;

    public String getTimestamp ()
    {
        return timestamp;
    }

    public void setTimestamp (String timestamp)
    {
        this.timestamp = timestamp;
    }

    public String getMessage ()
    {
        return message;
    }

    public void setMessage (String message)
    {
        this.message = message;
    }
    public String getError ()
    {
        return error;
    }

    public void setError (String error)
    {
        this.error = error;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }

    public ReturnResponse getData ()
    {
        return returnResponse;
    }

    public void setData (ReturnResponse data)
    {
        this.returnResponse = data;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [timestamp = "+timestamp+", message = "+message+", error = "+error+", status = "+status+", data = "+returnResponse+"]";
    }
}