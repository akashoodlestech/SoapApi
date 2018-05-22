package invoice;
public class PartData
{
    private String partDescription;

    private String unitCoreCharge;

    private String shipQuantity;

    private String serialNumber;

    private String mfgCode;

    private String backOrderQuantity;

    private String unitPrice;

    private String partId;

    private String mfgName;

    private String extendedAmount;

    private String orderQuantity;

    private String partNumber;

    public String getPartDescription ()
    {
        return partDescription;
    }

    public void setPartDescription (String partDescription)
    {
        this.partDescription = partDescription;
    }

    public String getUnitCoreCharge ()
    {
        return unitCoreCharge;
    }

    public void setUnitCoreCharge (String unitCoreCharge)
    {
        this.unitCoreCharge = unitCoreCharge;
    }

    public String getShipQuantity ()
    {
        return shipQuantity;
    }

    public void setShipQuantity (String shipQuantity)
    {
        this.shipQuantity = shipQuantity;
    }

    public String getSerialNumber ()
    {
        return serialNumber;
    }

    public void setSerialNumber (String serialNumber)
    {
        this.serialNumber = serialNumber;
    }

    public String getMfgCode ()
    {
        return mfgCode;
    }

    public void setMfgCode (String mfgCode)
    {
        this.mfgCode = mfgCode;
    }

    public String getBackOrderQuantity ()
    {
        return backOrderQuantity;
    }

    public void setBackOrderQuantity (String backOrderQuantity)
    {
        this.backOrderQuantity = backOrderQuantity;
    }

    public String getUnitPrice ()
    {
        return unitPrice;
    }

    public void setUnitPrice (String unitPrice)
    {
        this.unitPrice = unitPrice;
    }

    public String getPartId ()
    {
        return partId;
    }

    public void setPartId (String partId)
    {
        this.partId = partId;
    }

    public String getMfgName ()
    {
        return mfgName;
    }

    public void setMfgName (String mfgName)
    {
        this.mfgName = mfgName;
    }

    public String getExtendedAmount ()
    {
        return extendedAmount;
    }

    public void setExtendedAmount (String extendedAmount)
    {
        this.extendedAmount = extendedAmount;
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
        return "ClassPojo [partDescription = "+partDescription+", unitCoreCharge = "+unitCoreCharge+", shipQuantity = "+shipQuantity+", serialNumber = "+serialNumber+", mfgCode = "+mfgCode+", backOrderQuantity = "+backOrderQuantity+", unitPrice = "+unitPrice+", partId = "+partId+", mfgName = "+mfgName+", extendedAmount = "+extendedAmount+", orderQuantity = "+orderQuantity+", partNumber = "+partNumber+"]";
    }
}