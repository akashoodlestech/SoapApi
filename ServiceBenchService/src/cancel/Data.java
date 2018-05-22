package cancel;
public class Data
{
    private String responseMessage;

    public String getResponseMessage ()
    {
        return responseMessage;
    }

    public void setResponseMessage (String responseMessage)
    {
        this.responseMessage = responseMessage;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [responseMessage = "+responseMessage+"]";
    }
}