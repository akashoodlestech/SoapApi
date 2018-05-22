package cancel;
public class PartData
{
    private String lineNumber;

    private String partId;

    private String cancelQuantity;

    public String getLineNumber ()
    {
        return lineNumber;
    }

    public void setLineNumber (String lineNumber)
    {
        this.lineNumber = lineNumber;
    }

    public String getPartId ()
    {
        return partId;
    }

    public void setPartId (String partId)
    {
        this.partId = partId;
    }

    public String getCancelQuantity ()
    {
        return cancelQuantity;
    }

    public void setCancelQuantity (String cancelQuantity)
    {
        this.cancelQuantity = cancelQuantity;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [lineNumber = "+lineNumber+", partId = "+partId+", cancelQuantity = "+cancelQuantity+"]";
    }
}