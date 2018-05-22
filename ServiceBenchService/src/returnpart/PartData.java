package returnpart;
public class PartData
{
    private String returnReasonCode;

    private String returnTypeCode;

    private String lineNumber;

    private String serialNumber;

    private String partId;

    private String modelNumber;

    private String returnQuantity;

    public String getReturnReasonCode ()
    {
        return returnReasonCode;
    }

    public void setReturnReasonCode (String returnReasonCode)
    {
        this.returnReasonCode = returnReasonCode;
    }

    public String getReturnTypeCode ()
    {
        return returnTypeCode;
    }

    public void setReturnTypeCode (String returnTypeCode)
    {
        this.returnTypeCode = returnTypeCode;
    }

    public String getLineNumber ()
    {
        return lineNumber;
    }

    public void setLineNumber (String lineNumber)
    {
        this.lineNumber = lineNumber;
    }

    public String getSerialNumber ()
    {
        return serialNumber;
    }

    public void setSerialNumber (String serialNumber)
    {
        this.serialNumber = serialNumber;
    }

    public String getPartId ()
    {
        return partId;
    }

    public void setPartId (String partId)
    {
        this.partId = partId;
    }

    public String getModelNumber ()
    {
        return modelNumber;
    }

    public void setModelNumber (String modelNumber)
    {
        this.modelNumber = modelNumber;
    }

    public String getReturnQuantity ()
    {
        return returnQuantity;
    }

    public void setReturnQuantity (String returnQuantity)
    {
        this.returnQuantity = returnQuantity;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [returnReasonCode = "+returnReasonCode+", returnTypeCode = "+returnTypeCode+", lineNumber = "+lineNumber+", serialNumber = "+serialNumber+", partId = "+partId+", modelNumber = "+modelNumber+", returnQuantity = "+returnQuantity+"]";
    }
}