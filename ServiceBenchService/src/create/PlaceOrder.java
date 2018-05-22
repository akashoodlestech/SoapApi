package create;
public class PlaceOrder
{
    private String shipToName;

    private String shipToAddress1;

    private String shipToAddress2;

    private String shipToState;

    private String shipToCity;

    private String orderNumber;

    private String shipToPostalCode;

    private String shippingCarrier;

    private String emailAddress;

    private String shippingMethod;

    private String shippingCarrierAccount;

    private PartList partList;

    private String shipToCountryCode;

    public String getShipToName ()
    {
        return shipToName;
    }

    public void setShipToName (String shipToName)
    {
        this.shipToName = shipToName;
    }

    public String getShipToAddress1 ()
    {
        return shipToAddress1;
    }

    public void setShipToAddress1 (String shipToAddress1)
    {
        this.shipToAddress1 = shipToAddress1;
    }

    public String getShipToAddress2 ()
    {
        return shipToAddress2;
    }

    public void setShipToAddress2 (String shipToAddress2)
    {
        this.shipToAddress2 = shipToAddress2;
    }

    public String getShipToState ()
    {
        return shipToState;
    }

    public void setShipToState (String shipToState)
    {
        this.shipToState = shipToState;
    }

    public String getShipToCity ()
    {
        return shipToCity;
    }

    public void setShipToCity (String shipToCity)
    {
        this.shipToCity = shipToCity;
    }

    public String getOrderNumber ()
    {
        return orderNumber;
    }

    public void setOrderNumber (String orderNumber)
    {
        this.orderNumber = orderNumber;
    }

    public String getShipToPostalCode ()
    {
        return shipToPostalCode;
    }

    public void setShipToPostalCode (String shipToPostalCode)
    {
        this.shipToPostalCode = shipToPostalCode;
    }

    public String getShippingCarrier ()
    {
        return shippingCarrier;
    }

    public void setShippingCarrier (String shippingCarrier)
    {
        this.shippingCarrier = shippingCarrier;
    }

    public String getEmailAddress ()
    {
        return emailAddress;
    }

    public void setEmailAddress (String emailAddress)
    {
        this.emailAddress = emailAddress;
    }

    public String getShippingMethod ()
    {
        return shippingMethod;
    }

    public void setShippingMethod (String shippingMethod)
    {
        this.shippingMethod = shippingMethod;
    }

    public String getShippingCarrierAccount ()
    {
        return shippingCarrierAccount;
    }

    public void setShippingCarrierAccount (String shippingCarrierAccount)
    {
        this.shippingCarrierAccount = shippingCarrierAccount;
    }

    public PartList getPartList ()
    {
        return partList;
    }

    public void setPartList (PartList partList)
    {
        this.partList = partList;
    }

    public String getShipToCountryCode ()
    {
        return shipToCountryCode;
    }

    public void setShipToCountryCode (String shipToCountryCode)
    {
        this.shipToCountryCode = shipToCountryCode;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [shipToName = "+shipToName+", shipToAddress1 = "+shipToAddress1+", shipToAddress2 = "+shipToAddress2+", shipToState = "+shipToState+", shipToCity = "+shipToCity+", orderNumber = "+orderNumber+", shipToPostalCode = "+shipToPostalCode+", shippingCarrier = "+shippingCarrier+", emailAddress = "+emailAddress+", shippingMethod = "+shippingMethod+", shippingCarrierAccount = "+shippingCarrierAccount+", partList = "+partList+", shipToCountryCode = "+shipToCountryCode+"]";
    }
}