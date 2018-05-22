package OrderStatus;
public class OpenItems
{
    private PartList partList;

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
        return "ClassPojo [partList = "+partList+"]";
    }
}