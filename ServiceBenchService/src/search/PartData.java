package search;
public class PartData
{
    private String weight;

    private String partType;

    private AvailableLocation[] availableLocation;

    private String partPrice;

    private String partId;

    private String totalShipDate;

    private String retailPrice;

    private String quantityOnHand;

    private String partDescription;

    private String corePrice;

    private String mfgCode;

    private String mfgName;

    private String notes;

    private String totalPrice;

    public String getWeight ()
    {
        return weight;
    }

    public void setWeight (String weight)
    {
        this.weight = weight;
    }

    public String getPartType ()
    {
        return partType;
    }

    public void setPartType (String partType)
    {
        this.partType = partType;
    }

    public AvailableLocation[] getAvailableLocation ()
    {
        return availableLocation;
    }

    public void setAvailableLocation (AvailableLocation[] availableLocation)
    {
        this.availableLocation = availableLocation;
    }

    public String getPartPrice ()
    {
        return partPrice;
    }

    public void setPartPrice (String partPrice)
    {
        this.partPrice = partPrice;
    }

    public String getPartId ()
    {
        return partId;
    }

    public void setPartId (String partId)
    {
        this.partId = partId;
    }

    public String getTotalShipDate ()
    {
        return totalShipDate;
    }

    public void setTotalShipDate (String totalShipDate)
    {
        this.totalShipDate = totalShipDate;
    }

    public String getRetailPrice ()
    {
        return retailPrice;
    }

    public void setRetailPrice (String retailPrice)
    {
        this.retailPrice = retailPrice;
    }

    public String getQuantityOnHand ()
    {
        return quantityOnHand;
    }

    public void setQuantityOnHand (String quantityOnHand)
    {
        this.quantityOnHand = quantityOnHand;
    }

    public String getPartDescription ()
    {
        return partDescription;
    }

    public void setPartDescription (String partDescription)
    {
        this.partDescription = partDescription;
    }

    public String getCorePrice ()
    {
        return corePrice;
    }

    public void setCorePrice (String corePrice)
    {
        this.corePrice = corePrice;
    }

    public String getMfgCode ()
    {
        return mfgCode;
    }

    public void setMfgCode (String mfgCode)
    {
        this.mfgCode = mfgCode;
    }

    public String getMfgName ()
    {
        return mfgName;
    }

    public void setMfgName (String mfgName)
    {
        this.mfgName = mfgName;
    }

    public String getNotes ()
    {
        return notes;
    }

    public void setNotes (String notes)
    {
        this.notes = notes;
    }

    public String getTotalPrice ()
    {
        return totalPrice;
    }

    public void setTotalPrice (String totalPrice)
    {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [weight = "+weight+", partType = "+partType+", availableLocation = "+availableLocation+", partPrice = "+partPrice+", partId = "+partId+", totalShipDate = "+totalShipDate+", retailPrice = "+retailPrice+", quantityOnHand = "+quantityOnHand+", partDescription = "+partDescription+", corePrice = "+corePrice+", mfgCode = "+mfgCode+", mfgName = "+mfgName+", notes = "+notes+", totalPrice = "+totalPrice+"]";
    }
}