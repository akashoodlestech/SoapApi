package cancel;
public class CancelOrder
{
    private String orderNumber;

    private String orderConfirmationNumber;

    private PartList partList;

    public String getOrderNumber ()
    {
        return orderNumber;
    }

    public void setOrderNumber (String orderNumber)
    {
        this.orderNumber = orderNumber;
    }

    public String getOrderConfirmationNumber ()
    {
        return orderConfirmationNumber;
    }

    public void setOrderConfirmationNumber (String orderConfirmationNumber)
    {
        this.orderConfirmationNumber = orderConfirmationNumber;
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
        return "ClassPojo [orderNumber = "+orderNumber+", orderConfirmationNumber = "+orderConfirmationNumber+", partList = "+partList+"]";
    }
}