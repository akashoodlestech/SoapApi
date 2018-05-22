package OrderStatus;
public class OrderStatusResponse
{
    private OpenItems openItems;

    public OpenItems getOpenItems ()
    {
        return openItems;
    }

    public void setOpenItems (OpenItems openItems)
    {
        this.openItems = openItems;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [openItems = "+openItems+"]";
    }
}