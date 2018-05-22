package returnpart;
public class ReturnResponse
{
    private String returnLabelImage;

    private String rmaNumber;

    private String returnCity;

    private String returnPostalCode;

    private String returnAddress1;

    private String returnCountry;

    private String returnRequestNumber;

    private String returnCompany;

    private String returnLabelLink;

    private String returnState;

    private String returnAddess2; 
    private String status;
    private String errorMessage;

    public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getReturnLabelImage ()
    {
        return returnLabelImage;
    }

    public void setReturnLabelImage (String returnLabelImage)
    {
        this.returnLabelImage = returnLabelImage;
    }

    public String getRmaNumber ()
    {
        return rmaNumber;
    }

    public void setRmaNumber (String rmaNumber)
    {
        this.rmaNumber = rmaNumber;
    }

    public String getReturnCity ()
    {
        return returnCity;
    }

    public void setReturnCity (String returnCity)
    {
        this.returnCity = returnCity;
    }

    public String getReturnPostalCode ()
    {
        return returnPostalCode;
    }

    public void setReturnPostalCode (String returnPostalCode)
    {
        this.returnPostalCode = returnPostalCode;
    }

    public String getReturnAddress1 ()
    {
        return returnAddress1;
    }

    public void setReturnAddress1 (String returnAddress1)
    {
        this.returnAddress1 = returnAddress1;
    }

    public String getReturnCountry ()
    {
        return returnCountry;
    }

    public void setReturnCountry (String returnCountry)
    {
        this.returnCountry = returnCountry;
    }

    public String getReturnRequestNumber ()
    {
        return returnRequestNumber;
    }

    public void setReturnRequestNumber (String returnRequestNumber)
    {
        this.returnRequestNumber = returnRequestNumber;
    }

    public String getReturnCompany ()
    {
        return returnCompany;
    }

    public void setReturnCompany (String returnCompany)
    {
        this.returnCompany = returnCompany;
    }

    public String getReturnLabelLink ()
    {
        return returnLabelLink;
    }

    public void setReturnLabelLink (String returnLabelLink)
    {
        this.returnLabelLink = returnLabelLink;
    }

    public String getReturnState ()
    {
        return returnState;
    }

    public void setReturnState (String returnState)
    {
        this.returnState = returnState;
    }

    public String getReturnAddess2 ()
    {
        return returnAddess2;
    }

    public void setReturnAddess2 (String returnAddess2)
    {
        this.returnAddess2 = returnAddess2;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [returnLabelImage = "+returnLabelImage+", rmaNumber = "+rmaNumber+", returnCity = "+returnCity+", returnPostalCode = "+returnPostalCode+", returnAddress1 = "+returnAddress1+", returnCountry = "+returnCountry+", returnRequestNumber = "+returnRequestNumber+", returnCompany = "+returnCompany+", returnLabelLink = "+returnLabelLink+", returnState = "+returnState+", returnAddess2 = "+returnAddess2+"]";
    }
}