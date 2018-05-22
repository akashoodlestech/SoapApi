package cancel;
public class SkulocityCancelOrderResponse
{
    private String timestamp;

    private String message;

    private String extendedMessage;

    private String error;

    private String status;

    private Data data;

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

    public String getExtendedMessage ()
    {
        return extendedMessage;
    }

    public void setExtendedMessage (String extendedMessage)
    {
        this.extendedMessage = extendedMessage;
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

    public Data getData ()
    {
        return data;
    }

    public void setData (Data data)
    {
        this.data = data;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [timestamp = "+timestamp+", message = "+message+", extendedMessage = "+extendedMessage+", error = "+error+", status = "+status+", data = "+data+"]";
    }
}