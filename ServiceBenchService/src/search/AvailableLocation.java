package search;
public class AvailableLocation
{
    private String locationId;

    private String countryCode;

    private String locationName;

    private String availableQuantity;

    public String getLocationId ()
    {
        return locationId;
    }

    public void setLocationId (String locationId)
    {
        this.locationId = locationId;
    }

    public String getCountryCode ()
    {
        return countryCode;
    }

    public void setCountryCode (String countryCode)
    {
        this.countryCode = countryCode;
    }

    public String getLocationName ()
    {
        return locationName;
    }

    public void setLocationName (String locationName)
    {
        this.locationName = locationName;
    }

    public String getAvailableQuantity ()
    {
        return availableQuantity;
    }

    public void setAvailableQuantity (String availableQuantity)
    {
        this.availableQuantity = availableQuantity;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [locationId = "+locationId+", countryCode = "+countryCode+", locationName = "+locationName+", availableQuantity = "+availableQuantity+"]";
    }
}