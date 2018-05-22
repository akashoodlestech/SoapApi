package returnpart;
public class PartList
{
    private PartData partData;

    public PartData getPartData ()
    {
        return partData;
    }

    public void setPartData (PartData partData)
    {
        this.partData = partData;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [partData = "+partData+"]";
    }
}
