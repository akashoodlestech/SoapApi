package invoice;
public class InvoiceResponse
{
    private String invoiceDate;

    private String taxAmount;

    private String outboundShipingMethod;

    private String orderDate;

    private String orderNumber;

    private String orderConfirmationNumber;

    private String invoiceNumber;

    private String freightAmount;

    private String outboundTracking;

    private String inboundTracking;

    private PartList partList;

    public String getInvoiceDate ()
    {
        return invoiceDate;
    }

    public void setInvoiceDate (String invoiceDate)
    {
        this.invoiceDate = invoiceDate;
    }

    public String getTaxAmount ()
    {
        return taxAmount;
    }

    public void setTaxAmount (String taxAmount)
    {
        this.taxAmount = taxAmount;
    }

    public String getOutboundShipingMethod ()
    {
        return outboundShipingMethod;
    }

    public void setOutboundShipingMethod (String outboundShipingMethod)
    {
        this.outboundShipingMethod = outboundShipingMethod;
    }

    public String getOrderDate ()
    {
        return orderDate;
    }

    public void setOrderDate (String orderDate)
    {
        this.orderDate = orderDate;
    }

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

    public String getInvoiceNumber ()
    {
        return invoiceNumber;
    }

    public void setInvoiceNumber (String invoiceNumber)
    {
        this.invoiceNumber = invoiceNumber;
    }

    public String getFreightAmount ()
    {
        return freightAmount;
    }

    public void setFreightAmount (String freightAmount)
    {
        this.freightAmount = freightAmount;
    }

    public String getOutboundTracking ()
    {
        return outboundTracking;
    }

    public void setOutboundTracking (String outboundTracking)
    {
        this.outboundTracking = outboundTracking;
    }

    public String getInboundTracking ()
    {
        return inboundTracking;
    }

    public void setInboundTracking (String inboundTracking)
    {
        this.inboundTracking = inboundTracking;
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
        return "ClassPojo [invoiceDate = "+invoiceDate+", taxAmount = "+taxAmount+", outboundShipingMethod = "+outboundShipingMethod+", orderDate = "+orderDate+", orderNumber = "+orderNumber+", orderConfirmationNumber = "+orderConfirmationNumber+", invoiceNumber = "+invoiceNumber+", freightAmount = "+freightAmount+", outboundTracking = "+outboundTracking+", inboundTracking = "+inboundTracking+", partList = "+partList+"]";
    }
}