package returnpart;
public class ReturnRequest
{
    private String returnTrackingNumber;

    private String returnRequestNumber;

    private String invoiceNumber;

    private String requestReturnLabel;

    private PartList partList;

    public String getReturnTrackingNumber ()
    {
        return returnTrackingNumber;
    }

    public void setReturnTrackingNumber (String returnTrackingNumber)
    {
        this.returnTrackingNumber = returnTrackingNumber;
    }

    public String getReturnRequestNumber ()
    {
        return returnRequestNumber;
    }

    public void setReturnRequestNumber (String returnRequestNumber)
    {
        this.returnRequestNumber = returnRequestNumber;
    }

    public String getInvoiceNumber ()
    {
        return invoiceNumber;
    }

    public void setInvoiceNumber (String invoiceNumber)
    {
        this.invoiceNumber = invoiceNumber;
    }

    public String getRequestReturnLabel ()
    {
        return requestReturnLabel;
    }

    public void setRequestReturnLabel (String requestReturnLabel)
    {
        this.requestReturnLabel = requestReturnLabel;
    }

    public PartList getPartList ()
    {
        return partList;
    }

    public void setPartList (PartList partList)
    {
        this.partList = partList;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [returnTrackingNumber = "+returnTrackingNumber+", returnRequestNumber = "+returnRequestNumber+", invoiceNumber = "+invoiceNumber+", requestReturnLabel = "+requestReturnLabel+", partList = "+partList+"]";
    }
}