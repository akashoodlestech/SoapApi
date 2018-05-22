package create;
public class PartData
{
    private String locationId;

    private String partID;

    private String partPrice;

    private String mfgCode;

    private String orderQuantity;

    private String partNumber;

    public String getLocationId ()
    {
        return locationId;
    }

    public void setLocationId (String locationId)
    {
        this.locationId = locationId;
    }

    public String getPartID ()
    {
        return partID;
    }

    public void setPartID (String partID)
    {
        this.partID = partID;
    }

    public String getPartPrice ()
    {
        return partPrice;
    }

    public void setPartPrice (String partPrice)
    {
        this.partPrice = partPrice;
    }

    public String getMfgCode ()
    {
        return mfgCode;
    }

    public void setMfgCode (String mfgCode)
    {
        this.mfgCode = mfgCode;
    }

    public String getOrderQuantity ()
    {
        return orderQuantity;
    }

    public void setOrderQuantity (String orderQuantity)
    {
        this.orderQuantity = orderQuantity;
    }

    public String getPartNumber ()
    {
        return partNumber;
    }

    public void setPartNumber (String partNumber)
    {
        this.partNumber = partNumber;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [locationId = "+locationId+", partID = "+partID+", partPrice = "+partPrice+", mfgCode = "+mfgCode+", orderQuantity = "+orderQuantity+", partNumber = "+partNumber+"]";
    }
}